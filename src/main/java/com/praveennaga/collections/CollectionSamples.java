package com.praveennaga.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CollectionSamples {
	
	public static void main(String args[]) {
		List<Integer> al= new ArrayList<>();
		al.add(98);
		al.add(65);
		al.add(99);
		al.add(12);
		/*Collections.sort(al,Collections.reverseOrder());
		System.out.println(al);*/
		System.out.println(Collections.binarySearch(al, 65));
		
		LinkedList ll= new LinkedList(al);
		System.out.println(ll.get(0));
		
	}

}
