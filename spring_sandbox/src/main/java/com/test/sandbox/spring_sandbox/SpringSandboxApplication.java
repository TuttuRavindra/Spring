package com.test.sandbox.spring_sandbox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringSandboxApplication {

	public static void main(String[] args) {

		//Code Area-------------//
		//BinarySearch binarySearch = new BinarySearch(new SunnyString());
		
		//String result = binarySearch.BinarySearchMethod("ENTER THE STRING");
		
		//System.out.println(result);
		//Code Area-------------//
		
		ApplicationContext applicationContext =SpringApplication.run(SpringSandboxApplication.class, args);

		BinarySearch binarySearch = applicationContext.getBean(BinarySearch.class);

		binarySearch.BinarySearchMethod("EnteryourString");

		//SpringApplication.run(SpringSandboxApplication.class, args);

		
	}

}
