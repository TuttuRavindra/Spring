package com.test.sandbox.spring_sandbox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringSandboxApplication {

	public static void main(String[] args) {

		//Code Area-------------//
		BinarySearch binarySearch = new BinarySearch();

		String result = binarySearch.BinarySearchMethod("ENTER THE STRING");
		
		System.out.println(result);
		//Code Area-------------//
		
		SpringApplication.run(SpringSandboxApplication.class, args);
	}

}
