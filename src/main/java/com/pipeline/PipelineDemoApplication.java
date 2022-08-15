package com.pipeline;

import lombok.extern.log4j.Log4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Log4j
public class PipelineDemoApplication {
	public static void main(String[] args) {
		System.out.println("Application started successfull .................");
		SpringApplication.run(PipelineDemoApplication.class, args);
	}

}
