package com.te.arrays;

public class LargestElementInanarray {
	public static void main(String[] args) {
		int[]a= {2,3,1,2,3,4,2,1,3,2,1,2,1,};
		int largest=a[0];
		for (int i = 0; i < a.length; i++) {
			if(a[i]>largest)
			{
				largest=a[i];
			}
		}System.out.println(largest);
	}

}
