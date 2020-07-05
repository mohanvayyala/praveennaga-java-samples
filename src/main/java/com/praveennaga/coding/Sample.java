package com.praveennaga.coding;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

class Emp1 {
	String name;

	Emp1(String name) {
		this.name = name;
	}
    @Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (obj == null || obj.getClass() != this.getClass()) {
			return false;
		}
		Emp1 emp = (Emp1) obj;
		return this.name.equals(emp.name);
	}
    
    @Override
    public int hashCode() {    	
    	return name.hashCode();
    	
    }
}

public class Sample {

	public static void main(String args[]) {
	/*	
		int arr[]= {0,1,0,1,0};
		int oneIndex=0;
		
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]==1) {
				oneIndex=i;
				break;
			}
		}
		
		System.out.println(oneIndex);
		for(int i=0;i<arr.length;i++) {
			if(i<oneIndex) {
				arr[i]=0;
			}else {
				arr[i]=1;
			}
			
		}
		System.out.println(Arrays.toString(arr));*/
		/*
		 * StringJoiner s= new StringJoiner(","); s.add("Praveen"); s.add("Nani");
		 * System.out.println(s);
		 */

		/* List<String> l= new CopyOnWriteArrayList<String>(); l.add("praveen"); l.add("Nani");
		 l.add("kk"); Iterator<String> it= l.iterator();
		 while(it.hasNext()) {  System.out.println(it.next());
		 }
		 l.add("mm");
		 
		 System.out.println(l);*/
		
		 
		 LinkedList ll=new LinkedList<>();		
		 ll.add("praveen"); ll.add("Nani");
		 Iterator<String> iter = ll.iterator();
		 while(iter.hasNext()){
		    System.out.println(iter.next());
		     
		 }
		 
		 System.out.println(ll);
		 
		 
		/*HashMap<Emp1, Integer> hm = new HashMap<Emp1, Integer>();

		hm.put(new Emp1("Praveen"), 1);
		hm.put(new Emp1("Harish"), 2);
		hm.put(new Emp1("Praveen"), 4);
		
		System.out.println(hm.size());

		System.out.println(hm.get(new Emp1("Harish")));*/

		// int num[] = { 1, 9, 1, 6, 2, 9, 6 };
		//
		//
		// for (int i = 0; i < num.length; i++) {
		// boolean isDuplicate = false;
		//
		// for (int j = 0; j < i; j++) {
		// if (num[i] == num[j]) {
		// isDuplicate = true;
		// break;
		//
		// }
		// }
		// if (!isDuplicate) {
		// System.out.print(num[i]+" ");
		// }
		//
		// }
		//
		//
		// int a[] = {0,-2,0,5,2};
		//
		// int leftSum=a[0];
		// int rightProduct=1;
		// for(int i=0;i<a.length;i++) {
		// if(i==a.length-1) {
		// rightProduct=a[a.length-1];
		// }
		// for(int j=i+1;j<a.length;j++) {
		// rightProduct*=a[j];
		// }
		// if(leftSum==rightProduct) {
		// System.out.println(i);
		// }
		// if(i>0) {
		// leftSum+=a[i];
		// }
		// rightProduct=1; // reset
		// }
		//
		//

	}
}
