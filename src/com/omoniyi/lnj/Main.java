package com.omoniyi.lnj;

import org.ldk.batteries.ChannelManagerConstructor;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hey...");
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
