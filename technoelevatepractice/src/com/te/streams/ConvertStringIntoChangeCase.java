package com.te.streams;

import java.util.*;

// Write a Java program to convert a list of strings to uppercase or lowercase using streams.
public class ConvertStringIntoChangeCase {
	public static void main(String[] args) {
		List<String>list=Arrays.asList("pani","pavan","mahi","ramu");
		list.stream().map(e->e.toUpperCase()).forEach(System.out::println);
	}
}
