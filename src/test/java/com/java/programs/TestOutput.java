package com.java.programs;

import java.util.Arrays;

public class TestOutput {

	
	public static void main(String[] args) throws Exception {
		
		//char[] chars = {'w','y','e','o'};
		String str = new String("Laxman"); 
		byte[] bytes = str.getBytes(); 
		System.out.println(Arrays.toString(bytes)); 
		Arrays.sort(bytes);
		System.out.println(Arrays.toString(bytes)); 
		}
	}

