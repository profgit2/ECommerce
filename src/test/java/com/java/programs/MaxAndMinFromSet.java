package com.java.programs;

import java.util.HashSet;
import java.util.Set;

public class MaxAndMinFromSet {

	
	public static void main(String[] args) {
		
		Set<Integer> set= new HashSet<Integer>();
		
		set.add(100);
		set.add(500);
		set.add(400);
		int min=-1, max=-1;
	  //finding max value from set.
		
		for(int value:set) {
			
			if(max==-1)
			{
				max=value;
			}else if(value>max) {
				max=value;
			}
			//finding min value:
			if(min==-1) {
				min=value;
			}else if(value<min) {
				min=value;
			}
		}
		System.err.println("min="+min);
		System.out.println("max="+max);
	}
}
