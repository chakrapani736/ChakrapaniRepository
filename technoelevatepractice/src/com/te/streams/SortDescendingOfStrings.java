package com.te.streams;

import java.util.*;
import java.util.stream.Collectors;

public class SortDescendingOfStrings {
	public static void main(String[] args) {
		List<String>list=Arrays.asList("pani","mahi","king","queen");
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}

}
