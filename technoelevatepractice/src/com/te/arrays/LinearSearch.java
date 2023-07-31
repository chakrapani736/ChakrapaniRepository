package com.te.arrays;

public class LinearSearch {
	public static void main(String[] args) {
		int[]a= {20,32,21,44,31};
		int n=3;
		System.out.println(linear(a,n));
	}
		static String linear(int[]a,int n)
		{
			
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]==n)
			{
				return "found in index of"+i;
			}
			
		}return "not found";
	}

}
