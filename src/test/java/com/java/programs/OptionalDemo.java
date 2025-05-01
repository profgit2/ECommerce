package com.java.programs;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		
		int num=19;
		
		Optional<Boolean> b=Optional.ofNullable(num).flatMap(n->
		{
			if (n % 2 == 0) {
                System.out.println(n + " is even.");
            } else {
                System.out.println(n + " is odd.");
            }
			return Optional.of(num).map(nn->nn==190);
		});
		
		System.out.println(b.get());
	}
}
