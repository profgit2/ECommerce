package com.java.programs;

public class Swap {

	public static void main(String[] args) {
		
		int a=30,b=40;
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println(a+"  "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a+"  "+b);
		
	}
}
