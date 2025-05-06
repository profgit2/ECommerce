package com.java.programs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapCountWords {

	public static void main(String[] args) {
		
		String name="India Shrilanka Poland India Poland";
		String words[]=name.trim().split("\\s");
		Map<String, Integer> map= new HashMap<String, Integer>();
        for(int i=0;i<words.length;i++) {
        	if(map.containsKey(words[i])) {
        		int count=map.get(words[i]);
        		map.put(words[i],count+1);
        	}else {
        		map.put(words[i],1);
        	}
        }
        /*Set set= map.entrySet();
        Iterator itr=set.iterator();
        while(itr.hasNext()) {
        	Map.Entry m=(Map.Entry)itr.next();
        	
        	System.out.println(m.getKey()+ " = "+m.getValue());
        }
        //System.out.println(map);
*/	
        
  Set<Entry<String,Integer>> setValue=map.entrySet();
  
  Iterator<Map.Entry<String,Integer>> itr=setValue.iterator();
  
     while(itr.hasNext()) {
    	 Entry<String,Integer> entry=(Map.Entry<String,Integer>)itr.next();
    	 if(entry.getValue()>1) {
    	 System.out.println(entry.getKey()+ " "+entry.getValue());
    	 }
     }
	}
}
