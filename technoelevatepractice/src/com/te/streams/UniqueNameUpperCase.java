package com.te.streams;

import java.util.Arrays;
import java.util.List;

public class UniqueNameUpperCase {
	public static void main(String[] args) {
		 List<String>list=Arrays.asList("pani","pani","bijan","ganesh","pavi","raj");
		 list.stream().distinct().map(e->e.toUpperCase()).forEach(System.out::println);
	}

}
