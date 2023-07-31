package com.te.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapMethodInStreams {
	public static void main(String[] args) {
//		List<Integer> list=Arrays.asList(12,4,3,2,5,3,2,3);	
//		list.stream().map(e->e*5).forEach(System.out::println);
		List<List<String>> arrayList = new ArrayList<>();
		arrayList.add(Arrays.asList("kl","pani"));
		arrayList.add(Arrays.asList("bijan"));
		arrayList.add(Arrays.asList("ram","ganesh"));
		System.out.println(arrayList);
	 arrayList.stream().flatMap(e -> e.stream()).forEach(System.out::print);;
		//System.out.println(list);
	}

}
