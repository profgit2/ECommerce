package com.java.programs;

public class AlternateWordPrint2 {

	public static String name="1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16";

	public static void main(String[] args) {
	
		String token[]=name.split("\\s");
		for(int i=0;i<token.length;i++) {
			
			
			if(i!=token.length-1) {
			i++;
			System.out.print(token[i]+" ");
			//i++;
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