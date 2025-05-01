package com.java.programs;

public class Pyramid {

	
	public static void main(String[] args) {
		
//Java program to print diamond	
	for(int i=0;i<5;i++) {
		
		for(int j=5-i;j>0;j--) {
			System.out.print(" ");
		}
		for(int k=0;k<=i;k++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	for(int i=3;i>=0;i--) {
		
		for(int j=4-i;j>=0;j--) {
			System.out.print(" ");
		}
		for(int k=0;k<=i;k++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	}
}
