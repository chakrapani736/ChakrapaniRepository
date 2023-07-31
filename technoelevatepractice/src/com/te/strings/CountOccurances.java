package com.te.strings;

public class CountOccurances {
	public static void main(String[] args) {
		String s="andwerfasda";
		String res="";int count=0;
		while(0<s.length())
		{
			char ch=s.charAt(0);
			String s1=s.replace(ch+"", "");
			count=s.length()-s1.length();
			System.out.println(ch+" occurs "+count+" times");
			res+=ch;
			s=s1;
		}
	}

}
