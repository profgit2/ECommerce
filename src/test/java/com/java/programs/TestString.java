package com.java.programs;

public class TestString {

	public static void main(String[] args) {
		
        // Taking an array of size 4 
        int[] arr = new int[4]; 
  
        // Now this statement will cause an exception 
        
        arr[3]=11;
        int i = arr[3];
        //arr[3]=10;
        // This statement will never execute 
        // as above we caught with an exception 
        System.out.println("Hi, I want to execute "+i); 
    }
	}

