package com.te.strings;

public class Anagram {
	public static void main(String[] args) {
		String s = "race";
		String p = "care";
		if (isAnagram(s, p) == true)
			System.out.println("it is anagram");
		else
			System.out.println("not anagram");

	}

	public static boolean isAnagram(String s, String p) {
		while (0 < s.length()) {
			char ch = s.charAt(0);
			if (s.length() != p.length()) {
				return false;
			} else {
				s = s.replace(ch + "", "");
				p = p.replace(ch + "", "");
			}
		}
		return true;
	}

}
