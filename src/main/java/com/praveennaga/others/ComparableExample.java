package com.praveennaga.others;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableExample {
	
	public static void main(String args[]) {
		ArrayList<Employee> empList= new ArrayList<Employee>();
		empList.add(new Employee(110,"Praveen",34,200000));
		empList.add(new Employee(101,"Prasad",35,100000));
		empList.add(new Employee(108,"Ravi",34,500000));
		empList.add(new Employee(112,"Prakash",38,700000));
		Collections.sort(empList);
		System.out.println(empList);
	}

}

class Employee implements Comparable<Employee> {

	private int empId;
	private String empName;
	private int empAge;
	private double empSal;

	public Employee(int empId, String empName, int empAge, double empSal) {
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
		this.empSal = empSal;
	}

	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public int getEmpAge() {
		return empAge;
	}

	public double getEmpSal() {
		return empSal;
	}

	@Override
	public int compareTo(Employee emp) {

		if (this.empId == emp.empId)
			return 0;
		else if (this.empId > emp.empId)
			return +1;
		else
			return -1;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAge=" + empAge + ", empSal=" + empSal + "]";
	}

}
