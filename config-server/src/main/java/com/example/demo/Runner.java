package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer    //annotation for enabling(marking) this application as configuration server
public class Runner {
	
	public static void main(String[] args) {
		SpringApplication.run(Runner.class, args);
	}

}
