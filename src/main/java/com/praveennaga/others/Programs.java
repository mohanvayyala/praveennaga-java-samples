package com.praveennaga.others;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Programs {

	public static void main(String args[]) {
		int i = 5;

		System.out.println(i++);
		System.out.println(i);
		System.out.println(++i);
		System.out.println(i);

		// print series of even numbers
		for (int j = 2; j <= 20; j++) {
			if (j % 2 == 0) {
				System.out.println(j);
			}
		}

		int num = 12345;
		int remainder = 0;
		int reverse = 0;
		while (num > 0) {
			remainder = num % 10;
			reverse = reverse * 10 + remainder;
			num /= 10;
		}

		System.out.println(reverse);

		int a[] = { 25, 38, 12, 9, 45 };

		int max = a[0];
		int min = a[0];
		for (int l = 0; l < a.length; l++) {
			if (a[l] > max) {
				max = a[l];
			} else {
				min = a[l];
			}

		}
		System.out.println(max);
		System.out.println(min);
		
		int num1=5;
		int fact=1;
		while(num1>0) {
			fact=fact*num1;
			num1--;
		}
		
		System.out.println(fact);
		
		HashMap hm= new HashMap();
		hm.put(1, new Integer(2));
		hm.put(0, new Integer(3));
		hm.put(-1, new Integer(0));
		hm.put(3, new Integer(3));
		System.out.println(hm);
		
		
		
		
		
		

	}

}
