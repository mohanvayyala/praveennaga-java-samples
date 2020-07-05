package com.praveennaga.serialization;

import java.io.Serializable;

public class Card implements Serializable {
	private static final long serialVersionUID = -2989861987704472660L;
	
	String cardHolderName;
	int cardHolderAge;
	static String cardType;
	transient double cardAmount;
	

	public Card(String cardHolderName, int cardHolderAge, String cardType, double cardAmount) {
		this.cardAmount = cardAmount;
		this.cardHolderName = cardHolderName;
		this.cardHolderAge = cardHolderAge;
		Card.cardType = cardType;
	}

	@Override
	public String toString() {
		return "Card [cardHolderName=" + cardHolderName + ", cardHolderAge=" + cardHolderAge + ", cardType="
				+ Card.cardType + ",cardAmount=" + cardAmount+"]";
	}

}
