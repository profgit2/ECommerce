package com.java.programs;

public class ReereseEachWordInString {

	public static void main(String[] args) {
		
		String str="India is developing country"; 
		String words[]=str.split("\\s");  
	    String reverseWord="   t  ";  
	    for(String w:words){  
	        StringBuilder sb=new StringBuilder(w);  
	        sb.reverse();  
	        reverseWord+=sb.toString()+" ";  
	    }  
	   System.out.println(reverseWord.trim());  
	
		String sample="India gate is good";
		String token[]=sample.split("\\s");

		String reverse="";
		
		for(String data:token) {
			
			StringBuffer bf= new StringBuffer(data);
			reverse=reverse+bf.reverse()+" ";
		}
		System.out.println(reverse);
		}
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


