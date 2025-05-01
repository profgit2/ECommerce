package com.java.programs;

public class MaxValueFromArray {

	
	public static void main(String[] args) {
		
		int [] max= {89,65,99,43,86,71};
		

		int len=max.length;
		
		
		for(int i=0;i<len;i++) {
			
			for(int j=i+1;j<len;j++) {
				
				int temp=0;
				if(max[i]>max[j]) {
					
					temp=max[i];
					max[i]=max[j];
					max[j]=temp;
					
				}
			}
			
		}
		
		
		System.out.println("second highest number is: "+max[len-2]);
		
	}
}
