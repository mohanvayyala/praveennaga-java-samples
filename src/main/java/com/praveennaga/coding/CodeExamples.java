package com.praveennaga.coding;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;

public class CodeExamples {
	public static boolean isUniqueChars(String str) {
		/*
		 * if (str.length() > 128) { return false; } boolean[] char_set = new
		 * boolean[128]; for (int i = 0; i < str.length(); i++) { int val =
		 * str.charAt(i); if (char_set[val]) return false; char_set[val] = true; }
		 * return true;
		 */

		/*
		 * if (str.length() > 26) { // Only 26 characters return false; } int checker =
		 * 0; for (int i = 0; i < str.length(); i++) { int val = str.charAt(i) - 'a'; if
		 * ((checker & (1 << val)) > 0) return false; checker |= (1 << val); } return
		 * true;
		 */

		char ch[] = str.toCharArray();
		HashSet h = new HashSet();

		for (char chitem : ch) {
			h.add(chitem);
		}

		if (str.length() == h.size()) {
			return true;
		} else {
			return false;
		}

	}

	// check permutation of two strings

	public static boolean checkPermutationStrings(String str1, String str2) {

		if (str1.length() != str2.length()) {
			return false;
		}
		str1 = str1.toUpperCase();
		str2 = str2.toUpperCase();
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();

		Arrays.sort(ch1);
		Arrays.sort(ch2);

		return Arrays.equals(ch1, ch2);

	}

	// check permutation of two strings
	public static boolean permutationOptimized(String s, String t) {
		if (s.length() != t.length())
			return false; // Permutations must be same length

		int[] letters = new int[128]; // Assumption: ASCII
		for (int i = 0; i < s.length(); i++) {
			letters[s.charAt(i)]++;
		}

		for (int i = 0; i < t.length(); i++) {
			letters[t.charAt(i)]--;
			if (letters[t.charAt(i)] < 0) {
				return false;
			}
		}

		return true; // letters array has no negative values, and therefore no positive values either
	}

	public static String sort(String s) {
		char[] content = s.toCharArray();
		Arrays.sort(content);
		return new String(content);
	}

	// check permutation of two strings
	public static boolean permutation(String s, String t) {
		return sort(s).equals(sort(t));
	}

	public static String URLify(String s) {
		char[] contents = s.toCharArray();
		char[] modifiedcontents = new char[contents.length];
		int count = 0;
		int j = 0;
		for (int i = 0; i < contents.length; i++) {
			if (contents[i] == ' ') {
				count = count + 1;
				if (count == 1) {
					modifiedcontents[j] = '%';
					j++;
				}

			} else {
				count = 0;
				modifiedcontents[j] = contents[i];
				j++;

			}

		}
		return new String(modifiedcontents).replaceAll("%", "%20");
	}

	public static boolean isPermutationOfPalindrome(String phrase) {
		int countOdd = 0;
		int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
		for (char c : phrase.toCharArray()) {
			int x = getCharNumber(c);
			if (x != -1) {
				table[x]++;

				if (table[x] % 2 == 1) {
					countOdd++;
				} else {
					countOdd--;
				}
			}
		}
		return countOdd <= 1;
	}

	public static int getCharNumber(Character c) {
		int a = Character.getNumericValue('a');
		int z = Character.getNumericValue('z');

		int val = Character.getNumericValue(c);
		if (a <= val && val <= z) {
			return val - a;
		}
		return -1;
	}

	public static String stringCompression(String str) {

		char ch[] = str.toCharArray();
		StringBuffer sb = new StringBuffer();
		char lastCharacter = 0;
		int count = 1;

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == lastCharacter) {
				count = count + 1;
			} else {
				if (count > 1) {
					sb.append(count);
					count = 1;
				}
				sb.append(ch[i]);
			}
			if (i == ch.length - 1 && count > 1) {
				sb.append(count);
				count = 1;
			}

			lastCharacter = ch[i];

		}

		return sb.toString();
	}

	// palindrome String

	public static boolean isSubstring(String s) {
		/*
		 * String rev=""; for(int i=s.length()-1;i>=0;i--) { rev = rev + s.charAt(i); }
		 * if(rev.equals(s)) { return true; }else { return false; }
		 */

		return new StringBuilder(s).reverse().toString().equals(s);

	}

	public static void main(String[] args) {
		String[] words = { "abcde", "hello", "apple", "kite", "padle" };
		for (String word : words) {
			System.out.println(word + ": " + isUniqueChars(word));
		}
		// System.out.println(permutation("praveen","neevarp"));
		System.out.println(URLify("  Praveen  is a  "));

		// palindrome permutation
		System.out.println(isPermutationOfPalindrome("Tact Coa"));

		System.out.println(stringCompression("abcccdeffffff"));

		System.out.println(isSubstring("eee"));

		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(12);
		list.add(23);
		list.add(45);
		list.add(56);
		list.add(80);

		System.out.println(list);
		insertSorted(list, 5);
		System.out.println(list);
		
		LinkedList<String> listString = new LinkedList<String>();
		listString.add("12");
		listString.add("23");
		listString.add("45");
		listString.add("56");
		listString.add("80");
		listString.add("12");
		listString.add("92");
		listString.add("12");
		System.out.println(listString);
		removeMaximumValues(listString,12);
		System.out.println(listString);
		

	}

	public static void insertSorted(LinkedList<Integer> list, int value) {
		if (list != null) {
			int i=0;
			while( i < list.size()) {
				if (list.get(i) > value) {
					list.add(i, value);
					break;
				}else {
					list.add(value);
					break;
				}
			}
		}

	}
	
	public static void removeMaximumValues(LinkedList<String> list, int N) {
		
		if(N>=0) {
			for(int i=0;i<list.size();i++) {				
				if(list.get(i).equals(String.valueOf(N))) {
					list.remove(i);
				}
			}
		}


	}

}
