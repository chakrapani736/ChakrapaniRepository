package com.te.numberprograms;

public class ArmStrongNumber1 {
	public static void main(String[] args) {
		int n=153;
		int m=n;
		int length=0;
		while(0<m)
		{
			int rem=m%10;
			length++;
			m/=10;
		
		}
		System.out.println(length);
		int sum=0;
		int k=n;
		while(0<k)
		{
			int rem1=k%10;int rem2=1;
			for (int i = 1; i <=length; i++) {
				rem2*=rem1;
			}
			sum=sum+rem2;
			k/=10;
		}
		if(sum==n)
		{
			System.out.println("it is armStrongNumber");
		}
		else
		{
			System.out.println("it is not");
		}
	}

}
