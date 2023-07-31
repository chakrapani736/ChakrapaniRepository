package com.te.strings;

public class Permutations {
	public static void main(String[] args) {
		String a="abc";
		permutations(a,0,a.length()-1);
	}
	public static void permutations(String a,int first,int last)
	{
		if(first>last)
		{
			System.out.println(a);return;
		}
		int i=first;
		int j=last;
		for (int j2 =first; j2 <=last; j2++) {
			String s=swap(a,first,j2);
			permutations(s,first+1,last);
			
		}
	}public static String swap(String s,int a,int b)
	{
		char[] arr = s.toCharArray();
		char temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
		return new String(arr);
		
	}

}
