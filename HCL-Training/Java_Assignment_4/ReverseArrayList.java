package com.hcl.inner;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {

	public static void main(String[] args) {

		ArrayList<String> aList = new ArrayList<>();
		aList.add("Hello");
		aList.add("World");

		System.out.println(aList);
		Collections.reverse(aList);

		System.out.println(aList);
	}

}
