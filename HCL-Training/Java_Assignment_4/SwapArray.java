package com.hcl.inner;

import java.util.Scanner;

public class SwapArray {

	public static void main(String[] args) {
		int [] numbers= {1,2,3,4,5};
		int start=0;
		int finish=4;
		int swap=numbers[start];
		numbers[start]=numbers[finish];
		numbers[finish]=swap;
		for(int pos=0;pos<numbers.length;pos++)
			System.out.println(numbers[pos]+ " ");
		System.out.println();
 
	}
	

}