package com.te.streams;

import java.util.*;
import java.util.stream.Collectors;

public class PrintDuplicatesUsingStream {
	public static void main(String[] args) {
		List<Integer>list=Arrays.asList(1,3,2,1,4,5,3,5,4,6,5);
		list.stream().filter(e->list.lastIndexOf(e)!=list.indexOf(e)).distinct().forEach(System.out::println);
	}

}
