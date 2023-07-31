package com.te.numberprograms;

public class DeseriumNumber1 {
	public static void main(String[] args) {
		int n=175;int m=n;
		int sum=0;
		while(n>0)
			{int rem=n%10;
			sum+=pow(rem,count(n));
			n/=10;
			
			}
		if(sum==m)
		{
			System.out.println("it is deserium number");
		}
		else
		{
			System.out.println("it is not");
		}
		}
		public static int count(int n)
		{
			int count=0;
			while(n>0) {
				int rem=n%10;
				count++;
				n/=10;
			}return count;
		}
		public static int pow(int base,int pow)
		{
			int res=1;
			for (int i =1; i <=pow; i++) {
				res*=base;
			}return res;
		}
	

}
