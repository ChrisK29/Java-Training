package com.hcl;

import java.util.*;

public class EqualsToThird {
	public static void main(String[] args) {
		int x,y,z,sum;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter First Number: ");
		x=input.nextInt();
		
		System.out.println("Enter Second Number: ");
		y=input.nextInt();
		
		System.out.println("Enter Third Number: ");
		z=input.nextInt();
		
		if(x+y==z) {
			sum=x+y;
			System.out.println("Sum is: " + sum);
			System.out.println("True");
		}
		else if(x+z==y) {
			sum=x+y;
			System.out.println("Sum is: " + sum);
			System.out.println("True");
		}
		else if(y+z==x) {
			sum=y+z;
			System.out.println("Sum is: " + sum);
			System.out.println("True");
	}
		else
			System.out.println("False");
	}
}
