package com.java.programs;


public class CollectCapitalLetters {

	
	public static void main(String[] args) {
		
		String name="LaXMaN";
		
		char ch[]=name.toCharArray();
		StringBuffer buffer= new StringBuffer();
		for(int i=0;i<ch.length;i++) {
			
			if(Character.isUpperCase(ch[i])) {
			buffer.append(ch[i]);
			}
		}
		System.out.println(buffer.toString());
		
	}
}
