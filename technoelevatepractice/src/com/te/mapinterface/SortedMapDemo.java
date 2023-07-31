package com.te.mapinterface;

import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {
	public static void main(String[] args) {
		SortedMap<Object,Object> treeMap = new TreeMap<>();
		treeMap.put(1, "pani");
		treeMap.put(3, "pani");
		treeMap.put(2, "pani");
		treeMap.put(4, "pani");
		Object firstKey = treeMap.firstKey();
		
		
		for(Map.Entry map:treeMap.entrySet()) {
			System.out.print(map.getKey());
		}
	}

}
