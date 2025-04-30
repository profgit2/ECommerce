package com.ecom.javaprograms;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReadDemo {

	public static void main(String[] args) {
		
		FileReader reader = null;
	       try {
	           reader = new FileReader(new File("D:\\UserFile\\credit.txt"));
	           int character;
	           while((character=reader.read())!=-1) {
	        	
	        	   System.out.print((char) character);
	           }
	         
	       } catch (IOException e) {
	           // Handling the specific exception
	           System.out.println("An error occurred while reading the file: " + e.getMessage());
	       } finally {
	           // Cleanup code that always executes
	           if (reader != null) {
	               try {
	                   reader.close();
	               } catch (IOException e) {
	                   System.out.println("Error closing file: " + e.getMessage());
	               }
	           }
	       }
	}
}
