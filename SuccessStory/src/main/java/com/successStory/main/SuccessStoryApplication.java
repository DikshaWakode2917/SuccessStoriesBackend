package com.successStory.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = "com.successStory.main.Dto") 
public class SuccessStoryApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SuccessStoryApplication.class, args);
	}

}