package com.te.streams;

import java.util.*;

public class SecondSmallestGreatest {
	public static void main(String[] args) {
		 List<Integer>list=Arrays.asList(12,32,3,12,3,4,5,65,46,67);
		 Integer integer = list.stream().distinct().sorted().skip(1).findFirst().get();
		 System.out.println("second smallest element : "+integer);
		 Integer integer2 = list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		 System.out.println("second largest element : "+integer2);
		  
		 
	}

}
