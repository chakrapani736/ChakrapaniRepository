package com.te.numberprograms;

public class PrimeNumberUsingRecursion {
	public static void main(String[] args) {
		int n = 7;
		if (isPrime(n, 2) == true)
			System.out.println("it is prime number");
		else
			System.out.println("it is not");
	}

	public static boolean isPrime(int n, int m) {
		if (m < n) {
			if (n % m == 0) {
				return false;
			} else {
	 
				return isPrime(n, ++m);
			}
		} else {
			return true;

		}
	}

}
