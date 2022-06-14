package com.omoniyi.lnj;

import org.ldk.batteries.ChannelManagerConstructor;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class TestMain {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Client...");
        LDJService app = new LDJService();
        try {
//            int number, temp;
//            Scanner sc = new Scanner(System.in);
//            Socket socket = new Socket("127.0.0.1", 1324);
//            Scanner sc1 = new Scanner(socket.getInputStream());
//            System.out.println("Enter any number");
//            number = sc.nextInt();
//            PrintStream p = new PrintStream(socket.getOutputStream());
//            p.println(number);
//            temp=sc1.nextInt();
//            System.out.println(temp);





            String PEER_PUBKEY = "02fb85064a8f6c75655cdd8189b7c072dea0bcc90874abc1b130d9d951eb9c17ca";
            String PEER_HOST = "127.0.0.1";
            int PEER_PORT = 9730;
            app.connect(PEER_PUBKEY, PEER_HOST, PEER_PORT);
        } catch (RuntimeException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
