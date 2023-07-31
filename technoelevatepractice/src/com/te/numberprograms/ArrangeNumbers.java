package com.te.numberprograms;

public class ArrangeNumbers {
	public static void main(String[] args) {
		int[] a = { 1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1 };
		int i = 0, j = a.length - 1;

		while (i < a.length) {
			if (a[i] == 0) {
				if (a[j] == 1) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					j--;
					
				} else
					j--;i--;
			}
		}
		for (int n : a) {
			System.out.print(n + " ");
		}
	}

}
