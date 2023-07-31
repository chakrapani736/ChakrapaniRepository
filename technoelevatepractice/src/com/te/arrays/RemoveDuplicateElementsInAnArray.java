package com.te.arrays;

public class RemoveDuplicateElementsInAnArray {
	public static void main(String[] args) {
		int[]a= {3,2,4,1,3,2,5,3};
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]==a[j])
				{
					a[j]=-1;
				}
			}
		}
	}

}
