package com.te.arrays;

public class NotSmallerThanInNeighbor {
	public static void main(String[] args) {
		int []a = {1,2,3,4,8,6,7,9,6};
		for (int i = 0; i < a.length; i++) {
			if(i==0)
			{
			 if(a[i]>a[i+1])
				 System.out.println(a[i]+" is  not smaller than "+a[i+1]);
			}
			else if(i==a.length-1)
			{
				if(a[a.length-1]>a[a.length-2])
					System.out.println(a[a.length-1]+" is not samller than "+a[a.length-2]);
			}
			else
			{
				if(a[i]>a[i-1]&&a[i]>a[i+1])
					System.out.println(a[i]+" is not smaller than both "+a[i-1]+" , "+a[i+1]);
			}
		}
	}

}
