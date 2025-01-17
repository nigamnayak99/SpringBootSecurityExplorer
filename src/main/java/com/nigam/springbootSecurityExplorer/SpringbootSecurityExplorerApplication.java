package com.nigam.springbootSecurityExplorer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootSecurityExplorerApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootSecurityExplorerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Logger log = LoggerFactory.getLogger(SpringbootSecurityExplorerApplication.class);
		log.error("Test Error");
		log.warn("Test warn");
		log.info("Test info");
		log.debug("Test debug");
		log.trace("Test trace");
	}
}
