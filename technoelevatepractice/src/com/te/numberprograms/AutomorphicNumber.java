package com.te.numberprograms;

public class AutomorphicNumber {
	public static void main(String[] args) {
		int n=24;
		if(isAuto(n))System.out.println("it is automorphic number");
		
		else System.out.println("not automorphic number");
	}public static boolean isAuto(int n)
	{
		int sq=n*n,rem1=0,rem2=0;
		while(0<n)
		{
			
		
		rem1=sq%10;
		rem2=n%10;
		if(rem1!=rem2)
		{
			return false;
		}
		else
		{
			sq/=10;
			n/=10;
		}
		
		
		}return true;
		
	}

}
