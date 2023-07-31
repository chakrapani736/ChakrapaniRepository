package com.te.strings;

public class StringTest {
	public static void main(String[] args) {
		String s="my---name---is----pani";
		String res=removeHyphen(s);
		System.out.println(res);
		
	}
	public static String removeHyphen(String s)
	{
		return s.replaceAll("-+","-");
	}

}
