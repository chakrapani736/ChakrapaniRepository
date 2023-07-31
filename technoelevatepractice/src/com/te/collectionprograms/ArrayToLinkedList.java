package com.te.collectionprograms;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayToLinkedList {
	public static void main(String[] args) {
		ArrayList<Object> arrayList = new ArrayList<>();
		arrayList.add(20);
		arrayList.add(30);
		LinkedList<Object> linkedList = new LinkedList<>();
		linkedList.addAll(arrayList);
		System.out.println(linkedList);
	}

}
