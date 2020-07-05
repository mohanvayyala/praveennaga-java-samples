package com.praveennaga.coding;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

class Employee{
	private String name;
	private String departments;
	private int age;
	
	/**
	 * @param name
	 * @param departments
	 * @param age
	 */
	public Employee(String name, String departments, int age) {
		this.name = name;
		this.departments = departments;
		this.age = age;
	}
	public int ageDifference(final Employee other) {
		return age - other.age;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the departments
	 */
	public String getDepartments() {
		return departments;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [name=" + name + ", departments=" + departments + ", age=" + age + "]";
	}
}


public class JavaCodingExamples {

	public static void main(String args[]) {
		// Write a Java program to replace certain characters from String like
		String s = "hihowareyoueverythingalright";
		System.out.println(s.replace('e', 'f'));
        // Program to print fibonacci series using for loop
		int count = 12, num1 = 0, num2 = 1,sumOfPrevTwo=0;
		System.out.print("Fibonacci Series of " + count + " numbers:");

		for (int i = 1; i <= count; ++i) {
			System.out.print(num1 + " ");
			/*
			 * On each iteration, we are assigning second number to the first number and
			 * assigning the sum of last two numbers to the second number
			 */
			sumOfPrevTwo = num1 + num2;
			num1 = num2;
			num2 = sumOfPrevTwo;
		}
		
		//FizzBuzz problem : Write a Java program that prints the numbers from 1 to 50. 
		//But for multiples of three print "Fizz" instead of the number and 
		//for the multiples of five print "Buzz". For numbers which are multiples of both three and five print "FizzBuzz"
         
		for(int i=1;i<=50;i++) {
			if(i%3==0 && i%5==0) {
				System.out.println("FizzBuzz");
			}else if(i%3==0) {
				System.out.println("Fizz");
			}else if(i%5==0) {
				System.out.println("Buzz");
			}else {
				System.out.println(i);
			}
		}
        
		//Write a Comparator in Java to compare two employees based upon there name, departments and age?
        List<Employee> employees= new ArrayList<Employee>();
        Employee e1= new Employee("Praveen","IT",32);      
        Employee e2= new Employee("Anusha","IT",26);
        Employee e3= new Employee("Durga","COMM",33);
        employees.add(e1);
        employees.add(e2);     
        employees.add(e3);  
        Comparator<Employee> compareAgeAscending = (employee1, employee2) ->
        employee1.ageDifference(employee2);  
        System.out.println("Sorted in ascending order of age: "+
        		employees.stream()
	    		 .sorted(compareAgeAscending)
	    		 .collect(Collectors.toList())
	    		 );
        
        System.out.println("Sorted in descending order of age: "+
        		employees.stream()
	    		 .sorted(compareAgeAscending.reversed())
	    		 .collect(Collectors.toList())
	    		 );
	     
         final Function<Employee, Integer> byAge = employee -> employee.getAge();
	     final Function<Employee, String> byTheirName = employee -> employee.getName();
	     
	     System.out.println("Sorted in ascending order of age and name: "+
	    		 employees.stream()
	     .sorted(Comparator.comparing(byAge).thenComparing(byTheirName))
	     .collect(Collectors.toList()));
	     
	     
	     
	     Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	      HashMap<String,Integer> consolidatedMap= new HashMap<String,Integer> ();
	        for(int a0 = 0; a0 < n; a0++){
	            String name = in.next();
	            int d = in.nextInt();
	            int j = in.nextInt();            
	            consolidatedMap.put(name,d>j?d-j:j-d);
	        }
	        // Write Your Code Here
	        in.close();
	        
	         int maxValueInMap=(Collections.max(consolidatedMap.values())); 
	        
	        for (Entry<String,Integer> entry : consolidatedMap.entrySet()) {  
	            if (entry.getValue()==maxValueInMap) {
	                System.out.println(entry.getKey() + " " + maxValueInMap);     
	            }
	        }

	     
	     
	   
      
	}
	
	

}
