package com.test.sandbox.spring_sandbox;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearch {

	@Autowired
	private PrintString SonalString;

	public String BinarySearchMethod(String EnteryourString){

		return SonalString.BinarySearchMethod("Name");
	}

}
	