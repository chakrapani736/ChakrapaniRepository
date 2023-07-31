package com.te.streams;

import java.util.*;

public class DuplicateElements {
	public static void main(String[] args) {
		List<Integer>list=Arrays.asList(2,3,4,2,1,5,4,6,7);
		list.stream().distinct().forEach(System.out::println);
	}

}
