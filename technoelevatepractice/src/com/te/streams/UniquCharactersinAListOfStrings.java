package com.te.streams;

import java.util.*;
import java.util.stream.Collectors;

public class UniquCharactersinAListOfStrings {
	public static void main(String[] args) {
		List<String>list=Arrays.asList("pani","raam","ganesh");
		//list.stream().map(e->e.split("")).flatMap(Arrays::stream).distinct().forEach(e->System.out.print(e+" "));
		list.stream().map(e->e.split("")).flatMap(Arrays::stream).distinct().forEach(e->System.out.print(e+" "));
		//System.out.println(collect);
	}

}
