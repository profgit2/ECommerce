package com.java.programs;


import java.util.*;
import java.lang.*;
import java.util.Collection;

public class Oops {

	
	public static void printSomething() {
		int a=10;
		try {
			
		  System.out.println("Inside of try block..");	
		  System.exit((int) 0.0);
		//  System.out.println(Runtime.getRuntime().);
		}catch (Exception e) {
           System.out.println("Inside catch block error.");
           
		}
		
		finally {
			System.out.println("Inside of finally block..");
		}
	}
	public static void main(String[] args) {

		printSomething();
		
	}
}
