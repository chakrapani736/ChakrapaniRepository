package com.te.streams;

import java.util.Arrays;
import java.util.List;

public class StringProgram {
	public static void main(String[] args) {
		List<String>list=Arrays.asList("ahgcgtrz","bdjnwe","csdsd");
		list.stream().filter(e->e.length()>=5).forEach(e->System.out.println(e));
	}

}
