package com.java.programs;

import java.util.Scanner;

public class EvenOdd {

	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number");
	int num=sc.nextInt();
	System.out.println("Enter number is :"+num);
	//check number is even or odd.
	if(num%2==0) {
		System.out.println("number is even " +num);
	}else
	{
		System.out.println("Number is odd "+ num);
	}
	}
}
