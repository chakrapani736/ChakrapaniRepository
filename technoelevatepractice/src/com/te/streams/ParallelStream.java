package com.te.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStream {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8);
//		Stream<Integer> parallel = list.stream().parallel();
//		parallel.forEach(e->System.out.print(e+" "));
		Thread thread=new Thread();
		thread.setName("pani");
		list.parallelStream().forEach(e->System.out.println(e+" "+thread.currentThread().getName()));
	}

}
