package com.praveennaga.oops;

@FunctionalInterface
interface SampleInterface {
	int count = 5;
	void showCardData();
	default void cardDefaultData() {
		System.out.println("Premium Customer Card");
	}
	static void cardStaticData() {
		System.out.println("Identify Customer Card");
	}
	
}

abstract class SampleAbstractClass{	
	abstract void showCustData();
	void custDefaultData() {
		System.out.println("Premium Customer");
	}	
}

public class SampleAbstraction extends SampleAbstractClass implements SampleInterface {
	@Override
	public void showCardData() {
		System.out.println("Fetching the Customer Card Data ");
	}
	@Override
	void showCustData() {
		System.out.println("Fetching the Customer Data ");		
	}
	public static void main(String... args) {
		SampleAbstraction sampleabstraction = new SampleAbstraction();
		sampleabstraction.showCustData();
		sampleabstraction.custDefaultData();
		SampleInterface.cardStaticData();
		sampleabstraction.cardDefaultData();
		sampleabstraction.showCardData();
	}	
}
