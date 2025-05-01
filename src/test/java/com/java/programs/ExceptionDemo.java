package com.java.programs;

public class ExceptionDemo {

	
	public static void main(String[] args) 
    { 
        try
        { 
            // Creating an exception 
            NumberFormatException ex = 
                       new NumberFormatException("Exception laxman"); 
  
            // Setting a cause of the exception 
            ex.initCause(new NullPointerException( 
                      "This is actual cause of the exception")); 
            // Throwing an exception with cause. 
            throw ex; 
        } 
        catch(NumberFormatException e) 
        { 
            // displaying the exception 
           System.out.println(e); 
  
            // Getting the actual cause of the exception 
            System.out.println(e.getCause()); 
        } 
    } 
}
