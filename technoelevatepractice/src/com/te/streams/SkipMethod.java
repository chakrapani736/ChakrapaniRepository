package com.te.streams;

import java.util.Arrays;
import java.util.List;

public class SkipMethod {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(12,4,3,2,5,3,2,3);	
		list.stream().skip(1).forEach(e->System.out.println(e));
	}

}
