package com.java.programs;

public class SwitchCaseOFString {

	public static String switchCaseWord(String name) {
	
		int length=name.length();
		char c='\u0000';
		StringBuffer br= new StringBuffer();
		for(int i=0;i<length;i++) {
			
			char ch=name.charAt(i);
			
			if(Character.isTitleCase(ch)) {
				c=Character.toLowerCase(ch);
			}
			if(Character.isLowerCase(ch)) {
				c=Character.toUpperCase(ch);
			}
			if(Character.isUpperCase(ch)) {
				c=Character.toLowerCase(ch);
			}
			if(Character.isSpaceChar(ch)) {
				c=ch;
			}
			br.append(c);
		}
		return br.toString();
	}
	public static void main(String[] args) {
	
	String name="WaTcH ViDeOGamE";
	String ChangeCase=switchCaseWord(name);
	System.out.println("Change case of the string is: "+ChangeCase);
	}
}
