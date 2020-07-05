package com.praveennaga.oops;

class ParentClass {
	ParentClass() {
		System.out.println("Parent Class");
	}
	ParentClass(String name) {
		System.out.println("Parent Class " + name);
	}
	void DefaultClassData() {
		System.out.println("Default Class Data");
	}
	void ClassData() {
		System.out.println("Parent Class Data");
	}
}

class ChildClass extends ParentClass {
	ChildClass() {
		System.out.println("Child Class");
	}
	ChildClass(String name) {
		super("Praveen");
		System.out.println("Child Class " + name);
	}
	@Override
	void ClassData() {
		//super.DefaultClassData();
		System.out.println("Child Class Data");
	}
}

public class SampleInheritance {
	public static void main(String... args) {
		ParentClass childClass = new ChildClass("Kasyap");
		childClass.DefaultClassData();
		childClass.ClassData();
	}

}
