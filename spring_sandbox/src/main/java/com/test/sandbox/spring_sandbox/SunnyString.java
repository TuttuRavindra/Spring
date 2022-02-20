package com.test.sandbox.spring_sandbox;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
@Primary
public class SunnyString implements PrintString{

	public String BinarySearchMethod(String Name){
		return "String is coming from Sunny";
	}

}
	