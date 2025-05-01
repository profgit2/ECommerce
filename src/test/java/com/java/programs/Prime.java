package com.java.programs;

import java.util.Scanner;

public class Prime {


	public static void main(String[] args) {

		String userResponse="";
		//String userInput;
		do {
		int flag=0;
		Scanner user_input= new Scanner(System.in);
		System.out.println("Enter your input to check whether given number is prime or not..");
		int number=user_input.nextInt();
		
		for(int i=2;i<number/2;i++) {
			if(number%i==0) {
				flag=1;	
				break;
			}
		}
		if(flag==0) {
			System.out.println(number +" is prime number");
		}else {
			System.out.println(number+ " is not prime number");
		}
		System.out.println("Do you want to continue.. if yes type 'Y' else 'N'");
		Scanner userInput= new Scanner(System.in);
		userResponse=userInput.nextLine();
		}
		while(userResponse.equalsIgnoreCase("Y"));
		System.out.println("Seems you dont want to continue..");
	}
}
