package com.java.programs;

public class PrintSecondAndThirdWord {

	
	public static String name="My name is Laxman aa bb nn cc tt dd";
	
	public static void main(String[] args) {
		
		//String name="My name is Laxman dd sdsds dsadsad dsdsa";
	       String token[]=name.split("\\s");
		
			for(int i=0;i<token.length;i++) {
				i=i+1;
				System.out.print(token[i]+" ");
				/*if(i==0 || i==2) {
					continue;
				}
				System.out.print(token[i]+" ");*/
				//if(i!=token.length-1) {
					
				//}
	    }
	}
}
