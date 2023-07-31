package com.te.streams;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class AverageOfNumbers {
	public static void main(String[] args) {
		 List<Integer>list=Arrays.asList(2,3,4,5,1,6,3,2);
		  Double average = list.stream().mapToInt(v->v).average().getAsDouble();
		 System.out.println(average);
	}

}
