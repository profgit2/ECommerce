package com.java.programs;

import java.util.ArrayList;

public class ArrayStoreExcption {

	
    public static void main(String[] args) {
		
    
    	ArrayList<String> data= new ArrayList<String>();
    	//data.add(10);
    	
    	Object[] a = new Double[2]; 
        // Trying to store an integer value 
        // in this Double type array 
        a[0] = new Integer(4);
        System.out.println(a[0]);
	}
}
