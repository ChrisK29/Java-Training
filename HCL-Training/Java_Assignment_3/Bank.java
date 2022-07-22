package com.hcl.assignments;

public class Bank {
	
	int balance;
	
	public int withdraw(int toWithdraw, double amount) {
		
		if(balance >= amount) {
		this.balance = balance - toWithdraw;
		System.out.println("You just withdrawn: " + toWithdraw);
		}
		System.out.println("New balance: " + balance);
		return toWithdraw;
		
	}
	
	public void deposit(int toDeposit) {
		this.balance = balance + toDeposit;
		System.out.println("You just deposited: " + toDeposit);
		System.out.println("New balance: " + balance);
		
	}
	
	public static void main(String[] args) {
		Bank g = new Bank();
		
		
		g.deposit(2000);
		g.withdraw(1500);
		
	}

}
