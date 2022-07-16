package com.greatlearning.hello;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDemoProjectApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoProjectApplication.class, args);
		System.out.println("Welcome to main method.");
		System.out.println("Nice to be here!");
		
		
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hi There! welcome to Command Line Runner.");
	}

}
