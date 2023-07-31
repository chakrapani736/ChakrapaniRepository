package com.te.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class findFirstMethod {
	public static void main(String[] args) {
		List<Integer>list=Arrays.asList(8,3,1,3,4,5,6,7,8,9);
		 Integer integer = list.stream().sorted().findFirst().get();
		//System.out.println(findFirst);
		 System.out.println(integer);
	}

}
