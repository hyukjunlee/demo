package com.example.demo;

import org.springframework.boot.SpringApplication;  
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication 
public class HelloController {  
  
	public static void main(String[] args) {  
	SpringApplication.run(HelloController.class, args);
	
	System.out.println("Hello World");
	}  
}  