package com.praveennaga.polymorphism;

public class MethodOverriding {
	public static void main(String[] args) {
	 A a= new A();// In Class A
	 a.Show(); // show A
	 a.Print();// print A
	 //a.Display(); // compile time error Display method of A is not visible
     B b= new B(); // In Class A In Class B
     b.Show(); // show B
     b.Print(); // print B
     b.Display(); // display B
     A ab= new B();// In Class A In Class B
     ab.Show();// show B
     ab.Print(); // print A
     //ab.Display(); // compile time error Display method of A is not visible
     ab.Check(); // check A
	}

}

class A{
	A(){
		System.out.println("In Class A");
	}
	void Show() {
		System.out.println("show A");
	}
	
	static void Print() {
		System.out.println("print A");
	}
	private void Display() {
		System.out.println("display A");
	}
	
	void Check() {
		System.out.println("check A");
	}
}

class B extends A{
	B(){
		System.out.println("In Class B");
	}
	void Show() {
		System.out.println("show B");
	}
	
	 static void Print() {
		System.out.println("print B");
	}
	 
	  void Display() {
			System.out.println("display B");
		}
}
