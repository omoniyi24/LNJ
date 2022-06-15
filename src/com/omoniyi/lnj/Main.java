package com.omoniyi.lnj;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        int number, temp;
        System.out.println("Server...");
        ServerSocket serverSocket = new ServerSocket(1324);
        Socket socket = serverSocket.accept();
        Scanner sc = new Scanner(socket.getInputStream());
        number = sc.nextInt();
        temp = number * 2;
        PrintStream printStream =new PrintStream(socket.getOutputStream());
        printStream.println(temp);


        try {
            LDJService ldjServiceThread = new LDJService("LDJServiceThread", socket, socket.getInputStream(), socket.getOutputStream());
            ldjServiceThread.start();
            ldjServiceThread.join();
            String PEER_PUBKEY = "02fb85064a8f6c75655cdd8189b7c072dea0bcc90874abc1b130d9d951eb9c17ca";
            String PEER_HOST = "127.0.0.1";
            int PEER_PORT = 9730;
            ldjServiceThread.connect(PEER_PUBKEY, PEER_HOST, PEER_PORT, socket.getInputStream(), socket.getOutputStream());


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
