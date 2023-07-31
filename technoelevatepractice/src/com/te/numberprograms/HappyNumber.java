package com.te.numberprograms;

public class HappyNumber {
	public static void main(String[] args) {
		int n=86;
		int m=happy(n);
		if(m==1||m==7)
		{
			System.out.println("it is happy number");
		}else
		{
			System.out.println("it is not happy number");
		}
	}
	public static int happy(int n)
	{
		int sum=0;
		if(n<10)
		{
			return n;
		}else
		{
			while(0<n)
			{
				int rem=n%10;
				int sq=rem*rem;
				sum+=sq;
				n/=10;
			
				
			} return happy(sum);
		}
	}

}
