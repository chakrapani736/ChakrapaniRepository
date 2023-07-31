package com.te.strings;

//input="I am java Student";
//output="tnedutS avaj ma I";
public class StringReverseTypes1 {
	public static void main(String[] args) {
		String s = "I am java Student";
		String[] split = s.split(" ");
		for (int i = split.length - 1; i >= 0; i--) {
			System.out.print(rev(split[i]) + " ");

		}
	}

	public static String rev(String s) {
		char[] a = s.toCharArray();
		
		int i = 0, j = s.length() - 1;
		while (i <= j) {
			char temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i++;
			j--;

		}
		return new String(a);

	}

}
