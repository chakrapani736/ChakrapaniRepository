package com.te.streams;

import java.util.Arrays;
import java.util.List;

public class SumOfAllEvenNumbers {
	public static void main(String[] args) {
		List<Integer>list=Arrays.asList(2,1,3,4,1,1,2,4,5,6,7,7,3);
	 list.stream().limit(5).skip(3).forEach(System.out::println);
		//System.out.println(reduce);
	}

}
