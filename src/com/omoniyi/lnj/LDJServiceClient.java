package com.omoniyi.lnj;

import com.omoniyi.lnj.picocli.CommandLine;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static java.nio.file.Files.createFile;
import static java.nio.file.Path.of;

@CommandLine.Command(name = "lnj-cli", description = "Performs node operations", mixinStandardHelpOptions = true, version = "LNJ Client 1.0")
public class LDJServiceClient implements Callable<String> {

    @CommandLine.Option(names = "-connect", description = "Connect to a node with <nodeID>@<ip>:<port>")
    private String connectionString;

    @CommandLine.Option(names = "-listpeers", description = "Opens a given file")
    private boolean openFile;

    @CommandLine.Option(names = "-w", description = "Writes to a given file")
    private String fileToWrite;

    @CommandLine.Option(names="-r",description = "Opens a file and displays its contents")
    private String fileToRead;

    @CommandLine.Option(names = "-content", description = "Content to write to a file")
    private String content;

    public static void main(String... args) throws Exception {
        int exitCode = new CommandLine(new LDJServiceClient()).execute(args);
//        System.exit(exitCode);
    }

    public String call() throws Exception {

        LDJService ldjService = new LDJService();
        ldjService.start();

        if (connectionString != null) {
            Callable<Void> callableTask = () -> {
                TimeUnit.MILLISECONDS.sleep(300);
                String[] connectionStringSplit = connectionString.split("@");
                String peerPublicKey = connectionStringSplit[0];
                String peerAdderess = connectionStringSplit[1];
                String[] peerAdderessSplit = peerAdderess.split(":");
                String peerHost = peerAdderessSplit[0];
                int peerPort = Integer.parseInt(peerAdderessSplit[1]);
                ldjService.connect(peerPublicKey, peerHost, peerPort);
                return null;
            };

            ExecutorService executorService = Executors.newFixedThreadPool(10);

            executorService.submit(callableTask);

            executorService.shutdown();

        }
        return "success";
    }
}
