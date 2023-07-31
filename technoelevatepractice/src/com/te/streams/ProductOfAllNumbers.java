package com.te.streams;

import java.util.*;

public class ProductOfAllNumbers {
	public static void main(String[] args) {
		List<Integer>list=Arrays.asList(5,4,3,2,1,6,7,8);
		Integer reduce = list.stream().reduce(1,(a,b)->a*b);
		System.out.println(reduce);
	}
}
