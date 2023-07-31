package com.te.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DistinctCharactersPresentInAListOfStrings {
	public static void main(String[] args) {
		List<String>list=Arrays.asList("pani","mahi","ram","business","rajinish","pavithra");
	List<Character> collect = list.stream().flatMap(e->e.chars().mapToObj(c->(char)c)).distinct().collect(Collectors.toList());
	System.out.println(collect);
	}

}
