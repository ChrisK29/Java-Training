package com.hcl.assignments;

import java.util.Scanner;

public class Student {
	private int[] marks;

	double average () {
	    double markSum = 0;
	    double average;
	    int i;
	    for (i = 0; i < marks.length; i++) {
	        markSum = markSum + marks[i];
	    }
	    average = markSum / marks.length;
	    if (average >= 50 ) {
	    	System.out.println("Pass");
	    } else {
	    	return "Fail";
	    }
	    


	public static void Input(String name) {
		System.out.println(name);

	}

	public static void main(String[] args) {


	}
}
