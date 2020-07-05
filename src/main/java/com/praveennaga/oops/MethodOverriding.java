package com.praveennaga.oops;

import java.io.IOException;

class A {
	private String name;
	A(String name){
		this.name=name;
		System.out.println(name);	
	}
	private void A1() {
		System.out.println("A1");
	}
	
	private void A1(String a) {
		System.out.println("A1"+a);
	}
	
	final void A2() {
		System.out.println("A2");
	}
	
	protected void A3() {
		System.out.println("A3");
	}
	
	public void A4() {
		System.out.println("A4");
	}
	
	void A5() {
		System.out.println("A5");
	}
	
	void A6() throws Exception{
		System.out.println("A6");
	}
	void A7() throws IOException{
		System.out.println("A7");
	}
	
	void A8() throws NullPointerException{
		System.out.println("A8");
	}
	
	void A9() throws RuntimeException{
		System.out.println("A9");
	}
	
	Double A10() {		
		return new Double(10);
	}
}


public class MethodOverriding extends A {
	
	

	MethodOverriding(String name) {
		super(name);
	}
	
	private void A1() {
		
		System.out.println("MethodOverriding A1");
	}
	
	/*final void A2() {
		System.out.println("MethodOverriding A2");
	}*/
	public void A3() {
		System.out.println(super.A10());
		System.out.println("MethodOverriding A3");
	}
	
	public void A4()   {
		System.out.println("A4");
	}
	

	void A6(){
		System.out.println("MethodOverriding A6");
	}
	
	void A9(){
		System.out.println("MethodOverriding A9");
	}
	
	void A9(String s) throws Exception{
		System.out.println(s);
	}
	



	public static void main(String args[]) {
		A methodOverriding= new MethodOverriding("Praveen");
		methodOverriding.A3();
	}

}
