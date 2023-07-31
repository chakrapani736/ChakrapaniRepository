package com.te.arrays;

public class HighestOccurancesInAnArray {
	public static void main(String[] args) {
		int[]a= {3,2,1,4,1,2,3,1,2,1,2,1,3,4};
		int counthigh=0,maxFrequency=0;
		for (int i = 0; i < a.length; i++) {
			int count=0;
			for (int j = 0; j < a.length; j++) {
				if(a[i]==a[j])
				{
					count++;
				}
			}if(count>counthigh)
			{
				counthigh=count;
				maxFrequency=a[i];
			}
		}System.out.println(maxFrequency+" "+counthigh+" times");
	}

}
