package com.hcl.assignments;

public class WashingMachine {
	
	public static void switchOn() {
		System.out.println("Washing machine is on!");
	}
	
	public static void switchOff() {
		System.out.println("Washing machine is off!");
	}
	
	public static void acceptDetergent() {
		System.out.println("Detergent added!");
	}
	
	public static void acceptClothes(int noOfClothes) {
		
		System.out.println("Number of clothes: " + noOfClothes);
	}

	public static void main(String[] args) {
		
		switchOn();
		switchOff();
		acceptDetergent();
		acceptClothes(10);
		
		
	}
	

}
