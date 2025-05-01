package com.java.programs;

import java.util.Arrays;
import java.util.Comparator;

public class LongestString {

	
	public static void main(String[] args) {
		
		
		String s = "Laxman more compute";
		String longest=Arrays.stream(s.split("\\s")).max(Comparator.comparingInt(String::length)).orElse(null);
		System.out.println("Longest string is :"+longest);
	
		
		String shorts=Arrays.stream(s.split("\\s")).min(Comparator.comparingInt(String::length)).orElse(null);
		System.out.println(shorts);
	}
}
