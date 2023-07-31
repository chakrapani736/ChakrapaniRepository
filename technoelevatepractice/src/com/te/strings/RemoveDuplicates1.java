package com.te.strings;

public class RemoveDuplicates1 {
	public static void main(String[] args) {
		String s="fbrufygffyryv";
		String res="";
		int i=0;
		while(i<s.length())
		{
			char ch=s.charAt(i);
			if(res.indexOf(ch)==-1)
			{
				res+=ch;
			}
			i++;
		}System.out.println(res);
	}

}
