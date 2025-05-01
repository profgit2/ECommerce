package com.java.programs;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CountOfCharacters {

	public static void main(String[] args) {

		String name="LLaxxman";
		char chars[]=name.toCharArray();
		
		HashMap<Character, Integer> map= new HashMap<Character, Integer>();
		
		for(int i=0;i<chars.length;i++) {
		
		if(map.containsKey(chars[i])) {
			int count=map.get(chars[i]);
			map.put(chars[i],count+1);
			
		}else {
			map.put(chars[i],1);
		}
		}
		Set<Entry<Character, Integer>> set=map.entrySet();
		
		//Iterator itr=set.iterator();
		
		/*while(itr.hasNext()) {
			Map.Entry data=(Map.Entry)itr.next();
			System.out.println(data.getKey()+"-"+data.getValue());
		}*/
		
		for(Map.Entry<Character,Integer> etr:map.entrySet()) {
         
			System.out.println(etr.getKey()+" =="+etr.getValue());
			 
		}
	}
}
