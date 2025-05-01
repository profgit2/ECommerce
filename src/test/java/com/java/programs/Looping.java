package com.java.programs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Looping {

	
	public static void main(String[] args) {
		
		List<Integer> list= new ArrayList<Integer>();
		
		list.add(10);
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		list.add(16);

		//for(int i=0;i<list.size();i++){
			
			Iterator<Integer> itr=list.iterator();
			while(itr.hasNext()) {
				System.out.print(itr.next()+" ,");
			}
		//}
			
			for(int i=0;i<list.size();i++){
				
				System.out.println("list data: "+list.get(i));
			}
			
			for(Integer data:list) {
				System.out.println("dara are : "+data);
			}
	}
}
