package com.te.streams;
// Write a Java program to count the number of strings in a list that start with a specific letter using streams
import java.util.*;
import java.util.stream.Collectors;

public class StringsStartingLetters {
	public static void main(String[] args) {
	List<String>list=Arrays.asList("pani","ram","dan","fsda","ads","pavan");
	list.stream().filter(e->e.startsWith("p")).forEach(System.out::println);
	//System.out.println(collect);
	
	}
}
