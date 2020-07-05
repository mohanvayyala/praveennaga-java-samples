package com.praveennaga.string;

public class StringHandling {

	public static void main(String... args) {

		String s1 = "abc";
		String s2 = new String("abc");
		String s3 = "abc";
		String s4 = new String("abc");
		String s5 = new String("abc").intern();
		System.out.println("--comparing s1--");
		System.out.println(s1 == s2); // false
		System.out.println(s1 == s3); // true
		System.out.println(s1 == s4); // false
		System.out.println(s1 == s5); // true
		System.out.println("--comparing s2--");
		System.out.println(s2 == s3); // false
		System.out.println(s2 == s4); // false
		System.out.println(s2 == s5); // false

		System.out.println("--comparing s3--");
		System.out.println(s3 == s4); // false
		System.out.println(s3 == s5); // true

		System.out.println("--comparing s4--");
		System.out.println(s4 == s5); // false

		System.out.println("--comparing sb1,sb2,sbr1,sbr2--");
		StringBuilder sb1 = new StringBuilder("abc");
		StringBuilder sb2 = new StringBuilder("abc");
		StringBuffer sbr1 = new StringBuffer("abc");
		StringBuffer sbr2 = new StringBuffer("abc");
		System.out.println(sb1 == sb2); // false
		System.out.println(sb1.toString() == sb2.toString());// false
		System.out.println(sb1.equals(sb2)); // false
		System.out.println(sb1.toString().contentEquals(sb2)); // true
		System.out.println(sb1.toString().equals(sb2.toString())); // true
		System.out.println(sb1.toString().equals(s1));// true
		System.out.println(sbr1 == sbr2); // false
		System.out.println(sbr1.toString() == sbr2.toString());// false
		System.out.println(sbr1.equals(sbr2)); // false
		System.out.println(sbr1.toString().contentEquals(sbr2)); // true
		System.out.println(sbr1.toString().equals(sbr2.toString())); // true
		System.out.println(sbr1.toString().equals(s1));// true

		/*
		 * String a = "praveen"; String b = "praveen"; String e = a; String c = new
		 * String("praveen"); String d = new String("praveen");
		 * 
		 * System.out.println(a.hashCode()); System.out.println(b.hashCode());
		 * System.out.println(c.hashCode()); System.out.println(d.hashCode());
		 * System.out.println(e.hashCode());
		 * 
		 * if (a == c) { System.out.println("matched"); } else {
		 * System.out.println("not matched"); }
		 * 
		 * if (a.equals(c)) { System.out.println("matched"); } else {
		 * System.out.println("not matched"); }
		 * 
		 * System.out.println(a); System.out.println(c);
		 * System.out.println(Integer.toHexString(d.hashCode()));
		 * 
		 * System.out.println("a=" + System.identityHashCode(a));
		 * System.out.println("b=" + System.identityHashCode(b));
		 * System.out.println("c=" + System.identityHashCode(c));
		 * System.out.println("d=" + System.identityHashCode(d));
		 * 
		 * System.out.println(a.hashCode()); System.out.println(b.hashCode());
		 * System.out.println(c.hashCode()); System.out.println(d.hashCode());
		 */

		String a = "Praveen";
		String b = "Praveen";
		String c = new String("Praveen");
		String d = new String("Praveen");
		StringBuffer e = new StringBuffer("Praveen");
		StringBuffer f = new StringBuffer("Praveen");
		StringBuilder g = new StringBuilder("Praveen");
		StringBuilder h = new StringBuilder("Praveen");
		String i = d;
		StringBuffer j = e;
		StringBuilder k = g;

		System.out.println(a == b); // true
		System.out.println(a.equals(b)); // true
		System.out.println(a == c);// false
		System.out.println(a == c.intern());// true
		System.out.println(a.equals(c)); // true
		System.out.println(c == d);// false
		System.out.println(c.intern() == d.intern());// true
		System.out.println(c.equals(d));// true
		System.out.println(e == f);// false
		System.out.println(e.equals(f));// false
		System.out.println(e.toString().equals(f.toString()));// true
		System.out.println(g == h);// false
		System.out.println(g.equals(h));// false
		System.out.println(g.toString().equals(h.toString()));// true
		System.out.println(i == d);// true
		System.out.println(d.equals(i));// true
		System.out.println(j == e);// true
		System.out.println(j.equals(e));// true
		System.out.println(k == g);// true
		System.out.println(k.equals(g));// true

	}
}
