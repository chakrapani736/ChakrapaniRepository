package com.te.mapinterface;
import java.util.*;
public class TreeMapDemo {
	public static void main(String[] args) {
		Map<Object,Object> treeMap = new TreeMap<>();
		treeMap.put(1, "aaaa");
		treeMap.put(5, "aaaa");
		treeMap.put(4, "bbbbb");
		treeMap.put(3, "cccc");
		for(Map.Entry entry:treeMap.entrySet()) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}

}
