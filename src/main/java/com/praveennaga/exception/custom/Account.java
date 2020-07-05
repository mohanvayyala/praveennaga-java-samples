package com.praveennaga.exception.custom;

public class Account {
	String accNo;
	String accName;
	String accType;
	int balance;

	public Account(String acc_No, String acc_Name, String acc_Type, int acc_Balance) {
		accNo = acc_No;
		accName = acc_Name;
		accType = acc_Type;
		balance = acc_Balance;
	}

	public String getAccNo() {
		return accNo;
	}

	public String getAccName() {
		return accName;
	}

	public String getAccType() {
		return accType;
	}

	public int getBalance() {
		return balance;
	}
}
