package com.java.programs;

public class DuplicateWordsWithCount {

	public static void main(String[] args) {
		
        String providedString = "laxman more more more laxman";
        String[] brokenString = providedString.trim().split(" ");
        int count =0;
        for (int i =0; i < brokenString.length; i++){
        	count=1;
            for(int j =i+1; j < brokenString.length; j++){
                if(brokenString[i].equals(brokenString[j]) ){
                	count++;
                    brokenString[j]="0";
                }
            }
            if(count > 1 && brokenString[i]!="0")
            System.out.println(brokenString[i]+" "+count);
	}
}
}