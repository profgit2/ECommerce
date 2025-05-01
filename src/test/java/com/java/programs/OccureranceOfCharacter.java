package com.java.programs;

public class OccureranceOfCharacter {

	public static void main(String[] args) {
		
		String name="CC5";
		int count=0;
		for(int i=0;i<name.length();i++) {
			
			char ch=name.charAt(i);
			 
			if(ch=='C' || ch=='5') {
				count++;
			}
		}
		System.out.println("occurence of m are:"+count);
	}
}
