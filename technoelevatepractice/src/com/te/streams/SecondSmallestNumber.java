package com.te.streams;

import java.util.*;

public class SecondSmallestNumber {
	public static void main(String[] args) {
		List<Integer>list=Arrays.asList(5,3,4,2,1,6,8,7);
		Integer integer = list.stream().sorted().skip(1).findFirst().get();
		System.out.println(integer);
	}

}
