package com.te.streams;

import java.util.*;

public class MaxMinValuesInAListByDoubleValues {
	public static void main(String[] args) {
		List<Double>list=Arrays.asList(40.10,20.10,30.20);
		
		Double max = list.stream().max(Comparator.comparing(e->e)).get();
		Double max1 = list.stream().max(Comparator.comparing(Double::doubleValue)).get();
		System.out.println(max1);
		Double double1 = list.stream().min(Comparator.comparingDouble(e->e)).get();
		System.out.println(double1);
	}

}
