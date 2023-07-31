package com.te.equalsmethod;

public class FibonacciSeriesWOLoop {
	public static void main(String[] args) {
		FibonacciSeriesWOLoop fibonacciSeriesWOLoop = new FibonacciSeriesWOLoop();
		fibonacciSeriesWOLoop.fs(1);
		
	}
		int a=0;
		int b=1;
		int c;
		public  void fs(int n)
		{
			if(n>=10) {return;}
			else
			{
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
			fs(++n);
			}
		}
		
	

}
