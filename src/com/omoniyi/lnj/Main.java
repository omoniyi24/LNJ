package com.omoniyi.lnj;

import org.ldk.batteries.ChannelManagerConstructor;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

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


        LDJService app = new LDJService();
        try {
            app.start();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ChannelManagerConstructor.InvalidSerializedDataException e) {
            e.printStackTrace();
        } catch (RuntimeException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
