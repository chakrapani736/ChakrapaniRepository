package com.te.numberprograms;

public class Factorization {
	public static void main(String[] args) {
		int n=5,fact=1;
		while(n>0)
		{
			fact*=n;
			n--;
		}System.out.println(fact);
	}

}
