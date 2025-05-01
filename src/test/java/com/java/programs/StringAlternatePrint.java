package com.java.programs;

public class StringAlternatePrint {

	
	public static void main(String[] args) {
		
	
	String name="my name is laxman aarti patil more";
    
    String tokens[]=name.split("\\s");
    
    for(int i=0;i<tokens.length;i++){
        
        if(i==0){
            continue;
        }
        if(i==2)
        	continue;
        System.out.print(tokens[i]+" ");
    }
	}
}
