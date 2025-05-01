package com.java.programs;

public class StringReverse {

	public static String reverse(String input) {
		
		String reverse=" ";
        for(int i=input.length()-1;i>=0;i--) {
        	
        	reverse=reverse+input.charAt(i);
        }
        return reverse;
	}
	
	public static void main(String[] args) {
		
		String str="Automation";
		String reverse=reverse(str);
		System.out.println(reverse.trim());
	}
}
