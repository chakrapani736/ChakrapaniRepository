package com.te.streams;

import java.util.*;

public class InvalidEmailAddress {
	public static void main(String[] args) {
		List<String>list=Arrays.asList("pani123@gmail.com","ram1234");
		list.stream().filter(e->!e.endsWith("com")).forEach(System.out::println);;
	}

}
