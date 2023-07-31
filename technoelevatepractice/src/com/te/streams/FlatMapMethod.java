package com.te.streams;

import java.util.*;
import java.util.stream.Collectors;

public class FlatMapMethod {
	public static void main(String[] args) {
		List<List<Integer>>list=Arrays.asList(
				Arrays.asList(10,20),Arrays.asList(30,40),Arrays.asList(50,60)
				);
		List<Integer> collect = list.stream().flatMap(Collection::parallelStream).collect(Collectors.toList());
		System.out.println(collect);
		
		
	}

}
