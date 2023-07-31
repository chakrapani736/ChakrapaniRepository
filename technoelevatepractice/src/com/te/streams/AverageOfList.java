package com.te.streams;

import java.util.*;
import java.util.stream.Collectors;

//Write a Java program to calculate the average of a list of integers using streams.
public class AverageOfList {
	public static void main(String[] args) {
		List<Integer>list=Arrays.asList(2,2,3,1,3,4,4,5);
		double asDouble = list.stream().mapToInt(e->e).average().getAsDouble();
		System.out.println(asDouble);
	}

}
