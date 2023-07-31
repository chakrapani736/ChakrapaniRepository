package com.te.strings;

//input="i am java student";
//output="I Am Java Student";
public class Camel_Case {
	public static void main(String[] args) {
		String s = "i am java student";
		String res = "";
		String[] split = s.split(" ");
		for (String s1 : split) {
			System.out.print(ccase(s1) + " ");
		}
	}

	public static String ccase(String s) {
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			String cas = "";
			char ch = s.charAt(i);
			if (i == 0) {
				cas += cas + ch;
				String upperCase = cas.toUpperCase();
				res += upperCase;

			} else {
				res += ch;
			}
		}
		return res;
	}

}
