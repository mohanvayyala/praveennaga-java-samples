package com.praveennaga.oops;

class CheckingAccount {
	private double balance = 0;
	public void setBalance(double bal) {
		balance = bal;
	};
	public double getBalance() {
		return balance;
	};
}

public class SampleDataHiding {
	public static void main(String[] args) {
		CheckingAccount myAccount = new CheckingAccount();
		// myAccount.balance = 40.00;
		System.out.println("Balance = " + myAccount.getBalance());
	}
}
