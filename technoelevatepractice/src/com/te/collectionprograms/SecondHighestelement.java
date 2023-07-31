package com.te.collectionprograms;

import java.util.Iterator;

public class SecondHighestelement {
	public static void main(String[] args) {
		int[] a = { 3, 4, 2, 5, 1, 6, 8 };
		int fHigh = 0, sHigh = 0;

		for (int i = 1; i < a.length; i++) {
			if (a[i] > fHigh) {
				fHigh = a[i];

			}
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] != fHigh && a[i] > sHigh) {
				sHigh = a[i];
			}
		}
		System.out.println(sHigh);

	}

}
