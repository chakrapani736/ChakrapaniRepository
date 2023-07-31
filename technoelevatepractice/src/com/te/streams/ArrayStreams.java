package com.te.streams;

import java.util.Arrays;

public class ArrayStreams {
	public static void main(String[] args) {
		int[] a = { 82, 73, 94, 45, 36, 21 };
		Arrays.stream(a).filter(e->e%3==0).forEach(System.out::println);

	}

}
