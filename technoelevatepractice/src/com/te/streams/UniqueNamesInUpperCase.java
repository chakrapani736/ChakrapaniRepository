package com.te.streams;

import java.util.*;
import java.util.stream.Collectors;

public class UniqueNamesInUpperCase {
	public static void main(String[] args) {
		List<String>list=Arrays.asList("pani","ram","mahi","hari","mahesh");
		list.stream().distinct().map(e->e.toUpperCase()).forEach(System.out::println);
	}

}
