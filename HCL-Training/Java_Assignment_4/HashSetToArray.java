package com.hcl.inner;

import java.util.HashSet;

public class HashSetToArray {
	public static void main(String args[]) {

		HashSet<String> numbers = new HashSet<String>();

		numbers.add("One");
		numbers.add("Two");
		numbers.add("Three");
		numbers.add("Four");
		numbers.add("Five");

		System.out.println("The HashSet: " + numbers);

		Object[] arr = numbers.toArray();

		System.out.println("The Array is:");
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
	}
}
