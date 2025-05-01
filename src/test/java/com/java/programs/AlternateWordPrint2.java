package com.java.programs;

public class AlternateWordPrint2 {

	public static String name="My name is Laxman aa bb yy";

	public static void main(String[] args) {
	
		String token[]=name.split("\\s");
		for(int i=0;i<token.length;i++) {
			
			
			if(i!=token.length-1) {
			i=i+1;
			System.out.print(token[i]+" ");
			}
			
			/*if(i==0 || i==2) {
				continue;
			}
			System.out.print(token[i]+" ");*/
			//if(i!=token.length-1) {
				
			//}
		
	}

}
}