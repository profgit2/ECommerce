package com.java.programs;

public class Fibnaccie_Series {

//	public static int f1=0,f2=1,f3;
//	public static void fibonaccie_series(int num)
//	{
//		//int arr[]= new int[8];
//		//int i=0;
//		/*while(num>0) {
//			
//			f3=f1+f2;
//			f1=f2;
//			f2=f3;
//			System.out.print(","+f3);
//			//arr[i]=f3;
//			//i++;
//			num--;
//		}*/
//		//return arr;
//	}
	
	public static void main(String[] args) {
	    int f1=0,f2=1,f3=0;
		//int num1=0, num2=1;
		System.out.print(f1+","+f2);
		//int fib_num=8;
		//int arr[]= new int[10];
		//fibonaccie_series(fib_num);
		   int num=98;
		   //System.out.println(num<0);
           while(num>0) {
			f3=f1+f2;
			f1=f2;
			f2=f3;
			System.out.print(","+f3);
			//arr[i]=f3;
			//i++;
			num--;
		}
		//System.out.println("False");
	    /*arr =fibonaccie_series(fib_num);
	    for(int i=0;i<arr.length;i++) {
	    	System.out.print(","+arr[i]);
	    }*/
	}
}
