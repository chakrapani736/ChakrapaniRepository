package com.te.numberprograms;

public class FactorsOfANumber {
	public static void main(String[] args) {
		int n=6;
		for (int i = 1; i<=n/2; i++) {
			if(n%i==0)
			{
				System.out.println(i);
			}
		}
	}

}
