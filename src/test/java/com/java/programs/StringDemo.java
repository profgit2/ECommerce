package com.java.programs;

public class StringDemo {

	public static void main(String[] args) {
		
		   String str1=new String("Scaler").intern(); 
	       String str2=new String("Scaler").intern();    
	       System.out.println(str1 == str2);  
	       System.out.println(str1.equals(str2));
	       System.out.println(str1.substring(0, 4));
	       
	       
	       String fruit = "Apple"; 
	       switch(fruit) 
	       { 
	           case "Mango":
	               System.out.println("Sweet"); 
	               break; 
	           case "Apple": 
	               System.out.println("Delicious"); 
	               break; 
	           case "Orange": 
	               System.out.println("Luscious"); 
	               break; 
	           default: 
	               System.out.println("Not a fruit"); 
	       }
	       
	       
//	       String sstr1 = "scaler";                          //Line1
//	       String sstr2 = new String("scaler");      //Line2
//	       sstr2=sstr2.intern();                                       //Line 3
//	       System.out.println(sstr1 == sstr2);
	       
	       String str11 = new String("INTERVIEWBIT").intern();
	       String str22 = new String("INTERVIEWBIT").intern();
	       System.out.println(str11==str22);
	       
	       
	}
}
