package com.te.mapinterface;

import java.util.*;

public class HashMap1 {
	public static void main(String[] args) {
	HashMap<String,String> hashMap = new HashMap();
	hashMap.put("1", "aaa");
	hashMap.put("312", "kkk");
	hashMap.put("2", "hhh");
	hashMap.put("22", "lll");
	for(Map.Entry<String, String> entry1 :hashMap.entrySet())
	{
		System.out.println(entry1.getKey()+" : "+entry1.getValue());
	}
//	Set entrySet = hashMap.entrySet();
//	Iterator iterator = entrySet.iterator();
//	while(iterator.hasNext())
//	{
//		System.out.println(iterator.next());
//	}
//	
	}

}
