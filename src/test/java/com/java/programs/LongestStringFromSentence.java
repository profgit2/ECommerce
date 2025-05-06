package com.java.programs;

import java.util.Arrays;
import java.util.Comparator;

public class LongestStringFromSentence {

	public static void main(String[] args) {
		
		String name="India is bestcountry";
		String token[]=name.split("\\s");
		String longest=" ";
		
		for(int i=0;i<token.length;i++) {
			
			if(token[i].length()>longest.length()) {
				
				longest=token[i];
			}
		}
		
		System.out.println("Longest string: "+longest);
		
		
	//	String longestString=Arrays.stream(name.split("\\s")).max(Comparator.comparingInt(String::length)).orElse(null);
	//	System.out.println(longestString);
		
	}
}
