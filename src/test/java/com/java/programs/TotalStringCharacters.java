package com.java.programs;

public class TotalStringCharacters {

	
	public static void main(String[] args) {
		
		String str="Running Java Programs";
		int count=0;
		for(int i=0;i<str.trim().length();i++) {
			if(str.charAt(i)!=' ') {
				count++;
			}
		}
		System.out.println("Total number of characters in string are: "+count);
	}
}
