package com.te.strings;

public class SwappingWithoutThirdvariable {
	public static void main(String[] args) {
		String s="good ",s2="morning";
		System.out.println("before swapping : "+s+" "+s2);
		s=s+s2;
		s2=s.substring(0,s.length()-s2.length());
		s=s.substring(s2.length());
		System.out.println("after swapping : "+s+" "+s2);
		
	}

}
