package com.te.strings;

public class Pangram {
	public static void main(String[] args) {
		String s = "qwedrftgyhuajiskolkodpflggnmbvcxzaf";

		if (isPangram(s) == false)
			System.out.println("it is not pangram");
		else
			System.out.println("it is pangram");

	}

	public static boolean isPangram(String s) {
		for (char i = 'a'; i <= 'z'; i++) {
			if (s.indexOf(i) == -1)
				return false;
		}
		return true;
	}

}
