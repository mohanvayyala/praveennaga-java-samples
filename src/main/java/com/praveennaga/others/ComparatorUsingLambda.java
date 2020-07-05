package com.praveennaga.others;

import java.util.ArrayList;
import java.util.Comparator;

public class ComparatorUsingLambda {

	public static void main(String args[]) {
		ArrayList<EmployeeUpdated> empList = new ArrayList<EmployeeUpdated>();
		empList.add(new EmployeeUpdated(110, "Praveen", 34, 200000));
		empList.add(new EmployeeUpdated(101, "Prasad", 35, 100000));
		empList.add(new EmployeeUpdated(108, "Ravi", 34, 500000));
		empList.add(new EmployeeUpdated(112, "Prakash", 38, 700000));
		empList.sort(new Comparator<EmployeeUpdated>() {
			@Override
			public int compare(EmployeeUpdated e1, EmployeeUpdated e2) {
				return (int) (e1.getEmpSal() - e2.getEmpSal());
			}
		});
		System.out.println("SalaryComparator");
		empList.forEach((employee)->System.out.println(employee));
		empList.sort(new Comparator<EmployeeUpdated>() {
			@Override
			public int compare(EmployeeUpdated e1, EmployeeUpdated e2) {
				return (int) (e1.getEmpAge() - e2.getEmpAge());
			}
		});
		System.out.println("AgeComparator");
		empList.forEach((employee)->System.out.println(employee));
		empList.sort(new Comparator<EmployeeUpdated>() {
			@Override
			public int compare(EmployeeUpdated e1, EmployeeUpdated e2) {
				return e1.getEmpName().compareTo(e2.getEmpName());
			}
		});
		System.out.println("NameComparator");
		empList.forEach((employee)->System.out.println(employee));
	}

}
