package com.wftp.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class FlightConfigServerApplication {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(FlightConfigServerApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(FlightConfigServerApplication.class, args);
		LOGGER.info("Flight Config Service application started");
	}

}
