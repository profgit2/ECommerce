package com.java.programs;

public class SmallNumberFromArray {

	public static void main(String[] args) {
		
		int arr[]= {200,50,10,80};
		
		int smallNumber=arr[0];
		int sm=0;
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]<smallNumber) {
				sm=smallNumber;
				smallNumber=arr[i];
				
			}
			else if(arr[i]<sm) {
				sm=arr[i];
			}
		}
		System.out.println("small number is:"+smallNumber);
		System.out.println("sm: "+sm);
	}
}
