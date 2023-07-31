package com.te.streams;

import java.util.*;

public class RemoveDuplicates {
	public static void main(String[] args) {
		List<Integer>list=Arrays.asList(1,2,4,3,5,3,4,1,5,6,7,6,7,8,9);
		list.stream().distinct().forEach(e->System.out.print(e+" "));
	}

}
