package com.te.arrays;

public class CountDuplicateElement {
	public static void main(String[] args) {
		int[]a= {2,3,1,2,4,3};int[]frequency=new int[a.length];
		int visited=-1;
		for (int i = 0; i < a.length; i++) {
			int count=1;
			for (int j = i+1; j < a.length; j++) {
				if(a[i]==a[j])
				{
					a[j]=visited;count++;
				}
				
				
				
			}if(a[i]!=visited)
			{
				frequency[i]=count;
			}
		}for (int i = 0; i < a.length; i++) {
			if(a[i]!=visited)
			System.out.println(a[i]+" "+frequency[i]);
		}
	}

}
