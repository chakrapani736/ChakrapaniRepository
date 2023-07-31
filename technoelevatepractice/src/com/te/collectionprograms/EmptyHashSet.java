package com.te.collectionprograms;

import java.util.HashSet;

public class EmptyHashSet {
	public static void main(String[] args) {
		HashSet<Object> hashSet = new HashSet<>();
		System.out.println(hashSet);
		boolean empty = hashSet.isEmpty();
		System.out.println(empty);
	}

}
