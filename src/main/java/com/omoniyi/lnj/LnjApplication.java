package com.omoniyi.lnj;

import com.omoniyi.lnj.service.LDJService;
import org.ldk.batteries.ChannelManagerConstructor;

import java.io.IOException;

//@SpringBootApplication
public class LnjApplication {

	public static void main(String[] args){
		System.out.println("Hey...");
		LDJService app = new LDJService();
		try {
			app.start();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ChannelManagerConstructor.InvalidSerializedDataException e) {
			e.printStackTrace();
		}
	}

}
