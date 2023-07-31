package com.te.streams;
import java.util.*;
public class LimitMethod {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(12,4,3,2,5,3,2,3);	
		list.stream().limit(5).forEach(e->System.out.println(e));
	}

}
