package com.te.streams;

import java.util.*;

public class ConcatinateStringsWithComma {
	public static void main(String[] args) {
		List<String>list=Arrays.asList("pani","bijan","ganesh","pavi","raj");
		list.stream().forEach(e->System.out.print(e+" ,"));
	}

}
