package com.te.strings;

public class PallindromeString {
	public static void main(String[] args) {
		String s="malayalam";
		System.out.println(isPalli(s));
	}
	public static boolean isPalli(String s)
	{
		int i=0;
		int j=s.length()-1;
		while(i<j)
		{
		if(s.charAt(i)!=s.charAt(j))
		{
			return false;
		}
		else
		{
			i++;j--;
		}
		}
		return true;
	}

}
