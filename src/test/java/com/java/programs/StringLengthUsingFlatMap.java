package com.java.programs;

import java.util.Optional;

public class StringLengthUsingFlatMap {

	public static Optional<Integer> findLength(String name)
	{
		
		Optional<Integer> length=Optional.of(name).flatMap(str->
		
				Optional.of(str.length())
				
				);
	   
		return length;
		
	}
	
	public static void main(String[] args) {
		 
		Optional<Integer> lengthTest=findLength("Sneha");
		System.out.println("Length of teh string is:");
		lengthTest.ifPresent(System.out::print);
		
	}
}
