package com.praveennaga.others;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorExample {
	
	public static void main(String args[]) {
		ArrayList<EmployeeUpdated> empList= new ArrayList<EmployeeUpdated>();
		empList.add(new EmployeeUpdated(110,"Praveen",34,200000));
		empList.add(new EmployeeUpdated(101,"Prasad",35,100000));
		empList.add(new EmployeeUpdated(108,"Ravi",34,500000));
		empList.add(new EmployeeUpdated(112,"Prakash",38,700000));
		Collections.sort(empList,EmployeeUpdated.SalaryComparator);
		System.out.println("SalaryComparator \n"+empList);		
		Collections.sort(empList,EmployeeUpdated.AgeComparator);
		System.out.println("AgeComparator \n"+empList);
		Collections.sort(empList,EmployeeUpdated.NameComparator);
		System.out.println(empList);
	}

}

class EmployeeUpdated {

	private int empId;
	private String empName;
	private int empAge;
	private double empSal;

	public EmployeeUpdated(int empId, String empName, int empAge, double empSal) {
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


/**
     * Comparator to sort employees list or array in order of Salary
     */
    public static Comparator<EmployeeUpdated> SalaryComparator = new Comparator<EmployeeUpdated>() {

        @Override
        public int compare(EmployeeUpdated e1, EmployeeUpdated e2) {
            return (int) (e1.getEmpSal() - e2.getEmpSal());
        }
    };

    /**
     * Comparator to sort employees list or array in order of Age
     */
    public static Comparator<EmployeeUpdated> AgeComparator = new Comparator<EmployeeUpdated>() {

        @Override
        public int compare(EmployeeUpdated e1, EmployeeUpdated e2) {
            return e1.getEmpAge() - e2.getEmpAge();
        }
    };

    /**
     * Comparator to sort employees list or array in order of Name
     */
    public static Comparator<EmployeeUpdated> NameComparator = new Comparator<EmployeeUpdated>() {

        @Override
        public int compare(EmployeeUpdated e1, EmployeeUpdated e2) {
            return e1.getEmpName().compareTo(e2.getEmpName());
        }
    };


	@Override
	public String toString() {
		return "EmployeeUpdated [empId=" + empId + ", empName=" + empName + ", empAge=" + empAge + ", empSal=" + empSal + "]";
	}

}
