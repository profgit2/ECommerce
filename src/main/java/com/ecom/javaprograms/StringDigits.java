package com.ecom.javaprograms;

public class StringDigits {

	
	public static void countDigits(String input) {
		
		StringBuffer upper=new StringBuffer();
		StringBuffer lower= new StringBuffer();
		StringBuffer digits= new StringBuffer();
		StringBuffer special=new StringBuffer();
		
		for(int i=0;i<input.length();i++) {
			char ch=input.charAt(i);
			if(Character.isUpperCase(ch)) {
				upper.append(ch);
			}
			else if(Character.isLowerCase(ch)) {
				lower.append(ch);
			}else if(Character.isDigit(ch)) {
				digits.append(ch);
			}else {
				special.append(ch);
			}
		}
		System.out.println("Capital letterd:"+upper);
		System.out.println("Small Letters:"+lower);
		System.out.println("Gigits are:"+digits);
		System.out.println("Special Characters are:"+special);
	}
	
	public static void main(String[] args) {
		
		countDigits("Lax66m8anMore%$$#");
		
	}
}
