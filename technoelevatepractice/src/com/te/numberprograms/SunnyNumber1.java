package com.te.numberprograms;

public class SunnyNumber1 {
	public static void main(String[] args) {
		int n=8;
		
	if(isSunny(n)==true)
	{
		System.out.println("it is sunny");
		
	}else
	{
		System.out.println("not sunny");
	}
	
	}
		public static boolean isSunny(int n)
		{
			int m=n+1;
			for (int i =1; i <=n/2; i++) {
				if(m==i*i)
				{
					return true;
				}
				
			}return false;
		}
		
	

}
