package com.te.strings;

public class StringCharacters {
	public static void main(String[] args) {

		String s = "ma1gn4etjaa3@nu";
		int ccount = 0, vcount = 0, cocount = 0, spcount = 0, ncount = 0;
		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				ccount++;
				if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
						|| s.charAt(i) == 'u') {
					vcount++;
				} else {
					cocount++;
				}
			} else if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				ncount++;
			} else {
				spcount++;
			}

		}
		System.out.println("total chracters are : " + ccount);
		System.out.println("total vowels are : " + vcount);
		System.out.println("total consonants are : " + cocount);
		System.out.println("total special characters are : " + spcount);
		System.out.println("total  numbers are : " + ncount);
	}

}
