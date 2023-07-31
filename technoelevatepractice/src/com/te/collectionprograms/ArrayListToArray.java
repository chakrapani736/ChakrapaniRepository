package com.te.collectionprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListToArray {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(20);
		list.add(30);
		list.add(10);
		list.add(50);
		list.add(45);
	
		System.out.println(list);
		
		Object[] array = list.toArray();
	
	
		System.out.println(Arrays.toString(array));
	}

}
