package com.te.numberprograms;

public class FibonacciSeriesUsingrecursion {
	public static void main(String[] args) {
    int a=0,b=1,c=0;
    fibonacci(a,b,c);
    
	}
	public static void fibonacci(int a,int b,int c)
	{
		if(a<50)
		{
			System.out.println(a);
		
			c=a+b;
			a=b;
			b=c;
			fibonacci(a,b,c);
		}
	}
}
