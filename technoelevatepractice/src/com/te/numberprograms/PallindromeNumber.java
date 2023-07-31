package com.te.numberprograms;

public class PallindromeNumber {
	public static void main(String[] args) {
		int n=121;
		int m=n;
		int rev=0,sum=0;
		while(n>0)
		{
			int rem=n%10;
			rev=rem+(rev*10);
			n/=10;
			
		}if(m==rev)
		{
			System.out.println("it is pallindrome number");
		}else
		{
			System.out.println("it is not pallindrome number");
		}
	}

}
