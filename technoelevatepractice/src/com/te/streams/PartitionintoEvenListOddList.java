package com.te.streams;

import java.util.*;
import java.util.stream.Collectors;

public class PartitionintoEvenListOddList {
	public static void main(String[] args) {
		List<Integer>list=Arrays.asList(2,3,4,1,5,6,7,7,8,9);
		List<Integer>even=list.stream().filter(e->e%2==0).collect(Collectors.toList());
		List<Integer>odd=list.stream().filter(e->e%2!=0).collect(Collectors.toList());
		System.out.println("even numbers : "+even);
		System.out.println("odd numbers : "+odd);
	}

}
