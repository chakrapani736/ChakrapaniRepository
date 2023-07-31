package com.te.arrays;

import java.util.Arrays;

public class CountDuplicateElements {
	public static void main(String[] args) {
		int[]a= {2,3,2,1,2,3,2,5,6,4,3};
		int visited=-1;
		int[]frequency=new int[a.length];
		for (int i = 0; i < a.length; i++) {
			int count=1;
			for (int j = i+1; j < a.length; j++) {
				if(a[i]==a[j]) {
					a[j]=visited;
					count++;
				}
			}
			if(a[i]!=visited)
			{
				frequency[i]=count;
			}
			
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(frequency));
		for (int i = 0; i < frequency.length; i++) {
			for (int j = i+1; j < frequency.length; j++) {
				
			
			if(a[i]!=visited)
			{
				System.out.println(a[i]+" = "+frequency[i]);
			}
		}}
	}

}
