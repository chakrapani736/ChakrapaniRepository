package com.te.streams;

import java.util.*;

public class EvensumOddSumInAList {
	public static void main(String[] args) {
		List<Integer>list=Arrays.asList(1,3,2,4,5,6,3,4,7,8);
		Integer reduce = list.stream().filter(e->e%2==0).reduce(0,(a,b)->a+b);
		System.out.println(reduce);
	}

}
