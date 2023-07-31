package com.te.collectionprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableList {
	public static void main(String[] args) {
		String name="chakra";
		name="pani";
		String name1="pani";
		String name2="pani";
		System.out.println(name.hashCode()+" "+name2.hashCode());
		System.out.println(name);
		List<String> arrayList = new ArrayList<>();
		arrayList.add("pani");
		arrayList.add("bijan");
		
		arrayList.add("ganesh"); 
		boolean removeAll = arrayList.removeAll(arrayList);
		System.out.println(arrayList);
	
		
		List<String> unmodifiableList = Collections.unmodifiableList(arrayList);
		System.out.println(unmodifiableList);
		arrayList.add("rajnish");
		System.out.println(unmodifiableList);
		//List<String> of = List.of("pani","bijan","ganesh");
//		System.out.println(of);
//		of.add("tssd");
//		System.out.println(of);
		
	}

}
