package com.praveennaga.oops;

public class MethodOverloading {
	
	MethodOverloading(){
		System.out.println("MethodOverloading");
	}
	
	MethodOverloading(String name){
		System.out.println("MethodOverloading "+name);
	}
	
	public void A1() {
		System.out.println("praveen");
	}
	
	public String A1(String a) {
	 return "Hi "+a;
	}
	
	public String A1(String a,String b) {
		 return a+b;
	}
	
	public int A1(int a) {
		return a;
	}
	
	public int  A1(float a) {
		return (int) a;
	}
	
	public static void main( String args[]) {
		MethodOverloading methodOverloading= new MethodOverloading();
		methodOverloading.A1();
		System.out.println(methodOverloading.A1("Praveen"));
		System.out.println(methodOverloading.A1(10));
	}

}

