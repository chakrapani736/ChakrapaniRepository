package com.te.streams;

import java.util.Arrays;
import java.util.List;

public class ReduceMethod {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(12,4,3,2,5,3,2,3);
		Integer reduce = list.stream().reduce(1,(a,b)->a%b);
		System.out.println(reduce);
	}

}
