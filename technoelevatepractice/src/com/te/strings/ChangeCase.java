package com.te.strings;

public class ChangeCase {
	public static void main(String[] args) {
		String s="gooDmorninG";String res="";
		char[] arr = s.toCharArray();
		for (int i = 0; i <s.length(); i++) {
			
			if(s.charAt(i)>='a'&&s.charAt(i)<='z')
			{
				res+=(char) (s.charAt(i)-32);
			}
			else if(s.charAt(i)>='A'&&s.charAt(i)<='Z')
			{
				res+=(char) (s.charAt(i)+32);
			}
		}System.out.println(res);
	}

}
