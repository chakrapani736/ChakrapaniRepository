package com.te.streams;

import java.util.*;
import java.util.stream.Collectors;

public class ThreeeLongestStrings {
	public static void main(String[] args) {
		List<String>list=Arrays.asList("pani","ram","businesys","rajii","pavithra");
		list.stream().sorted(Comparator.comparing(String::length).reversed()).limit(3).forEach(e->System.out.println(e));
	}

}
