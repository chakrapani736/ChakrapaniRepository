package com.te.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//Write a Java program to sort a list of strings in alphabetical order, ascending and descending using streams
public class SortInAlphabeticalOrderOfAStringInAlist {
	public static void main(String[] args) {
		List<String>list=Arrays.asList("pani","ram","mahesh");
		list.stream().sorted().forEach(System.out::println); 
	}

}
