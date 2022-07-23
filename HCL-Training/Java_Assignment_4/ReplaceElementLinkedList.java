package com.hcl.inner;

import java.util.LinkedList;

public class ReplaceElementLinkedList {
	public static void main(String[] args) {

		LinkedList<String> tech = new LinkedList<String>();
		tech.add("Facebook");
		tech.add("Apple");
		tech.add("Amazon");
		tech.add("Netflix");
		tech.add("Google");
		System.out.println("The LinkedList is: " + tech);
		tech.set(0, "Meta");
		System.out.println("The LinkedList is: " + tech);
	}
}
