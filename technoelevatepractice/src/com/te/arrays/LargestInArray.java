package com.te.arrays;
public class LargestInArray {
	public static void main(String[] args) {
	int a[]= {1,3,4,2,7,6};
	int largest=a[0];
	for (int i = 1; i < a.length; i++) {
		if(a[i]>largest)
		{
			largest=a[i];
		}
	}System.out.println("largest element is "+largest);
	
	}
}
