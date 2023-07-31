package com.te.collectionprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class TraverseArrayList {
	public static void main(String[] args) {
		List<Object> arrayList = new ArrayList<>();
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(40);
		
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.print(arrayList.get(i)+" ");
		}
		System.out.println();
		for (int i = arrayList.size()-1; i >=0; i--) {
			System.out.print(arrayList.get(i)+" ");
		}
	}

}
