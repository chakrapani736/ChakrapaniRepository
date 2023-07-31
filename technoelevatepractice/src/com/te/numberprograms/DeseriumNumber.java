package com.te.numberprograms;

public class DeseriumNumber {
	public static void main(String[] args) {
		int n=175;
		int m=n;
		int sum=0;int count=0;
		while(n>0)
		{
			int rem=n%10;
			count++;
			if(count==1)
			{
				sum+=rem*rem*rem;
			}
			else if(count==2)
			{
				sum+=rem*rem;
			}
			else if(count==3)
			{
				sum+=rem*1;
			}
			n/=10;
			
			
		}
		if(sum==m)
		{
			System.out.println("it is deserium");
		}
		else
		{
			System.out.println("it is not");
		}
	}

}
