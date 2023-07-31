package com.te.streams;

import java.util.Arrays;
import java.util.List;

public class AnyMatchAllMatchMethods {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(12,4,3,2,5,3,2,3);	
		boolean result=list.stream().anyMatch(e->e*2==10);
		System.out.println(result);
	}

}
