package com.te.strings;

public class RemoveConjugativeCharacters {
	public static void main(String[] args) {
		String s="abbaaabba";
		int i=0,j=0;String res="";
		 while(i<s.length()-1)
		 {
			if(s.charAt(i)==s.charAt(j))
			{
				j++;
			}else if(s.charAt(i)!=s.charAt(j))
			{
				res+=s.charAt(i);
				i=j;
			}
		 }System.out.println(res+s.charAt(s.length()-1));
	}

}
