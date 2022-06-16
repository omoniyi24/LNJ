package com.omoniyi.lnj;

import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
//        int number, temp;
//        System.out.println("Server...");
//        ServerSocket socket = new ServerSocket(1324);
//        Socket ss = socket.accept();
//        Scanner sc = new Scanner(ss.getInputStream());
//        number = sc.nextInt();
//        temp = number * 2;
//        PrintStream p =new PrintStream(ss.getOutputStream());
//        p.println(temp);


        try {
            LDJService ldjService = new LDJService();
            ldjService.start();

//            String PEER_PUBKEY = "03ebb579eefc96a67517761c2c9d1ca692466d43e4f7ca7773db342f3aa8ff5716";
//            String PEER_HOST = "127.0.0.1";
//            int PEER_PORT = 10009;
//            ldjService.connect(PEER_PUBKEY, PEER_HOST, PEER_PORT);

            Callable<Void> callableTask = () -> {
                TimeUnit.MILLISECONDS.sleep(300);
                String PEER_PUBKEY = "0353f166d164322e9bed4e87ccbc8056adfdf1a6f4fbb23c441a988fe63a24c101";
                String PEER_HOST = "127.0.0.1";
                int PEER_PORT = 9736;
                ldjService.connect(PEER_PUBKEY, PEER_HOST, PEER_PORT);
                return null;
            };

            ExecutorService executorService = Executors.newFixedThreadPool(10);

            executorService.submit(callableTask);

            executorService.shutdown();


//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ChannelManagerConstructor.InvalidSerializedDataException e) {
//            e.printStackTrace();
        } catch (RuntimeException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
