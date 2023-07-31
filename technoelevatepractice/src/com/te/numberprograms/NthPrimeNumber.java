package com.te.numberprograms;

public class NthPrimeNumber {
	public static void main(String[] args) {
		int count1=0;
		for (int i =1; i <=100; i++) {
			int count=0;
			for (int j = 1; j <=i; j++) {
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				count1++;
				if(count1==5)
				{
					System.out.println("5th prime number is "+i);
				}
				
				
			}
			else
			{
				continue;
			}
		}
	}

}
