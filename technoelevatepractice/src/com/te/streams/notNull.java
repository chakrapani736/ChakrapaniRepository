package com.te.streams;

import java.util.*;

public class notNull {
	public static void main(String[] args) {
		List<String>list=Arrays.asList(null,"a","b");
//		Optional<String> findFirst = list.stream().filter(Objects::nonNull).findFirst();
//		System.out.println(findFirst);
		list.stream().map(e->e!=null?e:"default").forEach(e->System.out.println(e));
	
	}

}
