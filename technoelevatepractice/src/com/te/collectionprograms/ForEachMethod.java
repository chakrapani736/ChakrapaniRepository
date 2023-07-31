package com.te.collectionprograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ForEachMethod {
	public static void main(String[] args) {
		List<Object> arrayList = new ArrayList<>();
		arrayList.add(40);
		arrayList.add(30);
		arrayList.add(50);
		arrayList.add(20);
		System.out.println(arrayList);
		for (Object object : arrayList) {
			System.out.print(object+" ");
			
		}
		
		System.out.println();
		Iterator<Object> iterator = arrayList.iterator();
		while(iterator.hasNext())
		{
			System.out.print(iterator.next()+" ");
		}
		System.out.println();
		arrayList.forEach(s->System.out.print(s+" "));
		System.out.println();
		
		  
	}

}
