package com.te.numberprograms;

public class NeonNumber {
	public static void main(String[] args) {
		int n=5;
		int sq=n*n,sum=0;
		while(sq>0)
		{
			int rem=sq%10;
			sum+=rem;
			sq/=10;
			
		}if(sum==n)
		{
			System.out.println("it is neon number");
		}else
		{
			System.out.println("it is not neon number");
		}
	}

}
