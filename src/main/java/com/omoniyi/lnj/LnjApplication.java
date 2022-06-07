package com.omoniyi.lnj;

import com.omoniyi.lnj.service.LDJService;
import org.ldk.batteries.ChannelManagerConstructor;

import java.io.IOException;

//@SpringBootApplication
public class LnjApplication {

	public static void main(String[] args) throws IOException, ChannelManagerConstructor.InvalidSerializedDataException {
		System.out.println("Hey...");
		LDJService app = new LDJService();
		app.start();
//		SpringApplication.run(LnjApplication.class, args);
	}

}
