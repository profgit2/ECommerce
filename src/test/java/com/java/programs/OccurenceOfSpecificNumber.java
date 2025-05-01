package com.java.programs;

public class OccurenceOfSpecificNumber {

	public static void main(String[] args) {
		
		long num=9999851554l;
		int count=0;
		long rem=0;
         		
		while(num>0) {
			rem=num%10;
			if(rem==9) {
				count++;
			}
			num=num/10;
		}
		System.out.println("Occurences of 9 in number is : "+count);
	}
}
