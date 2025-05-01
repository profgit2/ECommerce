package com.java.programs;

public class Palindrome {

	public static void main(String[] args) {
	
		 String palindrome="papa";
	     String finalCheck=palindrome;
		 String reverse="";
		
		for(int i=palindrome.length()-1;i>=0;i--) {
			
			reverse=reverse+palindrome.charAt(i);
			
		}
		if(reverse.equals(finalCheck)) {
			System.out.println("String is palindrome");
		}else {
			System.out.println("String is not palindrome");
		}
	}
}
