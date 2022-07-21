package com.hcl;
import java.util.*;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println("Enter two numbers: ");
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		for (int i = 0; i < t; i++) {
			int n = input.nextInt();

			int prime = 2;
			while (prime * prime <= n) {
				if (n % prime == 0) {
					break;
				}
				prime++;
			}

			if (prime * prime > n) {
				System.out.println("Prime");
			} else {
				System.out.println("Not Prime");
			}
		}

	}
}