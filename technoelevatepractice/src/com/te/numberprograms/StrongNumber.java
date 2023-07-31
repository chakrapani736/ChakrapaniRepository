package com.te.numberprograms;

public class StrongNumber {
	public static void main(String[] args) {
		int n=145;
		int sum=0;
		int m=n;
		while(m>0)
		{int fact=1;
			int rem=m%10;
			for(int i=1;i<=rem;i++)
			{
				fact*=i;
			}
			sum+=fact;
			m/=10;
		}if(sum==n)
		{
			System.out.println("it is strong number");
		}
		else
		{
			System.out.println("it is not Strong");
		}
		
	}

}
