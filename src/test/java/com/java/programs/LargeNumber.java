package com.java.programs;

public class LargeNumber {

	
	public static void main(String[] args) {
		
		int arr[]= {10,300,980,200};
		int large=0;
		int secondHighest=0;
		int thirdlarge=0;
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>large) {
				secondHighest=large;
				large=arr[i];
			}
			else if(arr[i]>secondHighest) {
				thirdlarge=secondHighest;
				secondHighest=arr[i];
			}
			else if(arr[i]>thirdlarge) {
				thirdlarge=arr[i];
			}
		}
		System.out.println("Highest value is: "+large);
		System.out.println("second highest value from array is: "+secondHighest+" :third "
				+ "large:"+thirdlarge);
	}
}
