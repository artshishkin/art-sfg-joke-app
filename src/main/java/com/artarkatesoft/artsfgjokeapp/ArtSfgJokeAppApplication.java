package com.artarkatesoft.artsfgjokeapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:chuck-config.xml")
public class ArtSfgJokeAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArtSfgJokeAppApplication.class, args);
	}

}
