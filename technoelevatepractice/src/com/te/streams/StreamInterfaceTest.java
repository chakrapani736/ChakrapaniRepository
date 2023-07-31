package com.te.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamInterfaceTest {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(12,4,3,2,5,3,2,3);
		list.stream().map(e->e*2+" ").forEach(System.out::print);
		
	}

}
