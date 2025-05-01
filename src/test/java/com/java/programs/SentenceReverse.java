package com.java.programs;

public class SentenceReverse {
	
	public static String input="People love india";
	
	public static void main(String[] args) {
		
	/*String tokens[]=input.split("\\s");
	
	for(int i=tokens.length-1;i>=0;i--) {
	//word=tokens[i];
	System.out.print(tokens[i]+" ");
	}
	String reverses=" ";
	String revWord=" ";
	for(String tok:tokens) {
		
		for(int i=tok.length()-1;i>=0;i--) {
			reverses=reverses+tok.charAt(i);
		}
		reverses+=" ";		
	}
	//revWord=revWord+reverses;
	System.out.println("revesre: "+reverses);
	*/
	
	String str1="Indian are loving";
	String tok[]=str1.split("\\s");
	String words="";
	String rev="";
	for(int i=0;i<tok.length;i++) {
		words=tok[i];
		for(int k=words.length()-1;k>=0;k--) {
			rev=rev+words.charAt(k);
		}
		rev=rev+" ";
	}
	System.out.println(rev);
	}
}
