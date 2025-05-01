package com.java.programs;

public class ReplaceWhiteSpaces {

	public static void main(String[] args) {
		
		
		String str1 = "S aket Saurav        is an Autom ation Engi ne      er";
		  
  /*      char[] chars = str1.toCharArray();
  
        StringBuffer sb = new StringBuffer();
        String ="";
        for (int i = 0; i<chars.length; i++)
        {
            if( (chars[i] != ' '))
            {
                sb.append(chars[i]+" ");
            }
        } 
        System.out.println(sb.toString().trim());        
        */
		System.out.println(str1.replaceAll("\\s+"," "));
        String spaceRemove[]=str1.split("\\s");
        for(String ss:spaceRemove) {
        	//System.out.print(ss+"\t");
        	System.out.print(ss+" ");
        }
    }
}
