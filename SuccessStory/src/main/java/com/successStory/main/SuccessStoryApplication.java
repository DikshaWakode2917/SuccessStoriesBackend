package com.successStory.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@ComponentScan(basePackages = "com.successStory.main.Dto") 
public class SuccessStoryApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SuccessStoryApplication.class, args);
	}

}
