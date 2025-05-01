package com.java.programs;

public class SmallerNumber {

	public static void main(String[] args) {
		
		int arr[]= {1000,533,63,20,52};
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {

			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("Smaller number is :"+min);
		
	}
}
