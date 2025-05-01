package com.java.programs;

import java.awt.geom.FlatteningPathIterator;
import java.util.HashSet;
import java.util.Optional;
import java.util.Spliterator;

public class HashSetDemo {

	
	public static void main(String[] args) {
		
		HashSet<String> set= new HashSet<String>();
		set.add("ss");
		set.add("oi");
		
		//set.forEach((n)->System.out.println(n));
		Spliterator<String> splitsdata=set.spliterator();
		splitsdata.forEachRemaining(System.out::println);
		
	}
}
