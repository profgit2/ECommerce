package com.java.programs;

public class SecondHighestNumber {

	public static void main(String[] args) {
		
		
		int arr[]= {20,40,30,50};
		
		int largest = 0;
        int secondLargest = 0;
        int thirdLargest=0;
        int fourthLagest=0;
        /*for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + "\t");
        }*/
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > largest)
            {
                secondLargest = largest;

                largest = arr[i];
            }
            else if (arr[i] > secondLargest)
            {
            	thirdLargest=secondLargest;
                secondLargest = arr[i];
            }
            else if(arr[i]>thirdLargest) {
            	//fourthLagest=thirdLargest;
            	thirdLargest=arr[i];
            } /*else if(arr[i]>fourthLagest) {
            	fourthLagest=arr[i];
            }*/
            
        }

        System.out.println("Largest Number is: "  +largest);
        System.out.println("Second largest number is:" + secondLargest);
        System.out.println("TL-->"+thirdLargest);
        System.out.println("FL-->"+fourthLagest);
        
	}
}
