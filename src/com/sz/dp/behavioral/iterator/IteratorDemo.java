package com.sz.dp.behavioral.iterator;

import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {

		BikeRepository repository = new BikeRepository();
		repository.add("FZ");
		repository.add("RE");
		repository.add("HD");

		Iterator<String> it = repository.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
