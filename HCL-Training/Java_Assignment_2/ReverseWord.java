package com.hcl;

import java.util.*;

public class ReverseWord {
	public static void main(String[] args) {
		String reverse;
		int j, i = 0; 
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a word: ");
		reverse = input.nextLine();
		
		String[] reverseArray = reverse.split(" ");
		
		do
		{
			char[] ch = reverseArray[i].toCharArray();
			j = ch.length - 1;
			
			do
			{
				System.out.print(ch[j]);
			} while( --j >= 0);
			System.out.print(" ");
		} while(++i < reverseArray.length);
	}
}