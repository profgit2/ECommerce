package com.java.programs;

import java.util.HashMap;
import java.util.Map;

public class SorthashMap {

	
	public static void main(String[] args) {
		
		HashMap<Integer, String> sort=new HashMap<>(); 
		
		sort.put(4, "india");
		sort.put(1, "nepal");
		sort.put(3,"shrilanka");
		
		sort.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach((val)->System.out.println(val));
		
		
		
		
	}
}
