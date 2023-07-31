package com.te.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class UniqueCharactersInaStringList {
	public static void main(String[] args) {
		List<String>list=Arrays.asList("javadeveloper","pani");
		//Arrays::stream generate separate streams and what you want is to flatten all those streams into single stream E.g.
	//list.stream().map(e->e.split("")).flatMap(Arrays::stream).distinct().forEach(System.out::print);
	//System.out.println(collect);
		List<String[]> collect = list.stream().map(e->e.split("")).distinct().collect(Collectors.toList());
		
	
	}

}
