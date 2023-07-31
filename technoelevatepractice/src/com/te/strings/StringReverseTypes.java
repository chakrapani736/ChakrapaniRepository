package com.te.strings;

//input="i am java student"
//output="i ma avaj tneduts"
public class StringReverseTypes {
	public static void main(String[] args) {
		String s = "I am java Student";
		String[] split = s.split(" ");
		for (String s1 : split) {
			System.out.print(rev(s1)+" ");
		}
	}

	public static String rev(String s) {
		char[] a = s.toCharArray();
		int i = 0, j = s.length()-1;
		while (i <= j) {
			char temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;j--;
			
		}return new String(a);

	}

}
