package com.te.streams;

import java.util.*;

public class Longeststring {
	public static void main(String[] args) {
		List<String>list=Arrays.asList("pani","bijan","hari","ganesh","pavi","raj");
		List<Integer>list1=Arrays.asList(4,3,2,1,5,6);
		Optional<Integer> findFirst = list1.stream().sorted().findFirst();
		System.out.println(findFirst);
		//Optional<Integer> max = list1.stream().max(Comparator.naturalOrder());
		//System.out.println(max);
		String string = list.stream().max(Comparator.comparingInt(String::length)).get();
		System.out.println(string);
	} 

}
