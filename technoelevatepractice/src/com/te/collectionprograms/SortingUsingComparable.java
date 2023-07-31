package com.te.collectionprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingUsingComparable{

	public static void main(String[] args) {
		
		 List<Integer> arrayList = new ArrayList<>(Arrays.asList(66,45,77,75,50));
		Comparator<Integer> com= (a,b)->(a%10>b%10)?1:-1;
		 Collections.sort(arrayList,com);
		 
		 System.out.println(arrayList);
	
	}

	

}
