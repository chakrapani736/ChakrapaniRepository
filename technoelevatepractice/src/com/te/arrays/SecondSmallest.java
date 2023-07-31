package com.te.arrays;

public class SecondSmallest {
	public static void main(String[] args) {
		System.out.println(10/0);
		int[] a = { 12, 32, 2, 13, 5, 121, 31 };
		int small = a[0];
		int secondSmall = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] < small) {
				small = a[i];

			}

		}for (int i = 1; i < a.length; i++) {
			if ((a[i] < secondSmall)&&(a[i]!=small)) {
				secondSmall = a[i];

			}}


		System.out.println(secondSmall);	}

}

