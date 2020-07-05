package com.praveennaga.exception.custom;

public class Test {
	public static void main(String[] args) {
		Account acc1 = new Account("abc123", "Praveen", "Savings", 20000);
		Transaction tx1 = new Transaction();
		tx1.withdraw(acc1, 15000);
		System.out.println("Transaction for account number "+ acc1.getAccNo() +" is complete \n");
		Account acc2 = new Account("xyz123", "Prasad", "Savings", 10000);
		Transaction tx2 = new Transaction();
		tx2.withdraw(acc2, 15000);
		System.out.println("Transaction for account number "+ acc2.getAccNo() +" is complete");
	}
}
