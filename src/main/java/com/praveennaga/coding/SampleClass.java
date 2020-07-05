package com.praveennaga.coding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

 class Emp implements Comparator<Emp> {
	private int age;
	private String name;
	private double salary;

	Emp() {
	}

	public Emp(int age, String name, double salary) {
		this.age = age;
		this.name = name;
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public int compare(Emp o1, Emp o2) {
		return o1.getName().compareTo(o2.getName());
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", salary=" + salary + "]";
	}

}

public class SampleClass {

	public static void main(String... args) throws InterruptedException {
		Emp p1 = new Emp(32, "Praveen", 209090090);
		Emp p2 = new Emp(33, "Durga", 210090090);
		List<Emp> employeeList = new ArrayList<Emp>();
		employeeList.add(p1);
		employeeList.add(p2);
		System.out.println(employeeList);
		Collections.sort(employeeList, new Emp());
		System.out.println(employeeList);
		int a[] = { 1, 9, 8, 6, 5, 8, 2, 1, 9 };
		printDistinctElements(a);
		System.out.println("\t");
		printDistinct(a);

	}

	static void printDistinctElements(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			boolean isDistinct = false;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					isDistinct = true;
					break;
				}
			}
			if (!isDistinct) {
				System.out.print(arr[i] + " ");
			}
		}
	}

	static void printDistinct(int arr[]) {
		// Creates an empty hashset
		HashSet<Integer> set = new HashSet<>();

		// Traverse the input array
		for (int i = 0; i < arr.length; i++) {
			// If not present, then put it in hashtable and print it
			if (!set.contains(arr[i])) {
				set.add(arr[i]);
				System.out.print(arr[i] + " ");
			}
		}
		
		set=null;
	}

}
