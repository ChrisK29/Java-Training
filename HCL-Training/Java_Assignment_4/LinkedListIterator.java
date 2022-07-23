package com.hcl.inner;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListIterator {
	public static void main(String[] args) {

		LinkedList<String> numbers = new LinkedList<String>();
		numbers.add("One");
		numbers.add("Two");
		numbers.add("Three");
		numbers.add("Four");
		numbers.add("Five");
		System.out.println("LinkedList:" + numbers);

		// Setting List Iterator as specific position
		ListIterator itr = numbers.listIterator(2);
		System.out.println("Iterator:");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}