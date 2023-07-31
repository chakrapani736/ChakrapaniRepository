package com.te.collectionprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class RemoveElementsInIterator {
	public static void main(String[] args) {
		List<Integer> asList = new ArrayList<>();
		List<Integer> asList2 = new ArrayList<>();
		asList.add(20);
		asList.add(10);
		asList.add(60);
		Collections.copy(asList,asList2 );
		System.out.println(asList2);
//		List<Integer> synchronizedList = Collections.synchronizedList(asList);
//		
//		Iterator<Integer> iterator = asList.iterator();
//		while(iterator.hasNext())
//		{
//			iterator.remove();
//			System.out.println(iterator.next());
//			
//		}
	}

}
