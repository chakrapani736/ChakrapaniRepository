package com.te.numberprograms;

public class XylemAndPhloemNumber {
	public static void main(String[] args) {
		int n=1237;
		int m=n;
		int midsum=0,exsum=0;
		while(n>0)
		{
		if(n<10||n==m)
		{
			int rem=n%10;
			exsum+=rem;
		}
		else
		{
			int rem=n%10;
			midsum+=rem;
			
		}n/=10;
		}if(exsum==midsum)
		{
			System.out.println("it is xylem number");
			
		}else
		{
			System.out.println("it is phloem number");
		}
	}

}
