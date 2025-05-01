package com.java.programs;

import java.util.Optional;

public class StringLengthUsingMap {

	
	
	
	
	public static Optional<Integer> finfLength(String name)
	{
		
		Optional<Integer> length=Optional.of(name).map(n->
		{	
			int len=n.length();
		    return len;
		});
		
		return length;
		
	}
	
	public static void main(String[] args) {
			
		Optional<Integer> subName=finfLength("Laxman");
		System.out.println("Length of the string is:"+subName.get());
	}
}
