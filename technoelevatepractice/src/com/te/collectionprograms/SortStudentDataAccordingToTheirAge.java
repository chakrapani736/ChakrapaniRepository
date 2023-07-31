package com.te.collectionprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortStudentDataAccordingToTheirAge implements Comparable<SortStudentDataAccordingToTheirAge>{
	String name;
	int age;
	public SortStudentDataAccordingToTheirAge(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int compareTo(SortStudentDataAccordingToTheirAge o) {
		
		return this.name.charAt(0)-o.name.charAt(0);
	}
	@Override
	public String toString() {
		return "StudentAccordingToAge [" + (name != null ? "name=" + name + ", " : "p") + "age=" + age
				+ "]";
	}
	public static void main(String[] args) {
		List<SortStudentDataAccordingToTheirAge> list=new ArrayList<SortStudentDataAccordingToTheirAge>();
		list.add(new SortStudentDataAccordingToTheirAge("pani", 26));
		list.add(new SortStudentDataAccordingToTheirAge("bijan", 24));
		list.add(new SortStudentDataAccordingToTheirAge("ganesh", 27));
	     Collections.sort(list );
	     for (SortStudentDataAccordingToTheirAge sortStudentDataAccordingToTheirAge : list) {
	    	 System.out.println(sortStudentDataAccordingToTheirAge);
			
		}
	}

}
