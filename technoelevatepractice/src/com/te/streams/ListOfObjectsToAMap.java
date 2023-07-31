package com.te.streams;

import java.util.*;
import java.util.stream.Collectors;

class Student1{
	String name;
	int id;
	public Student1(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
public class ListOfObjectsToAMap {
	public static void main(String[] args) {
		List<Student1>list=new ArrayList<>();
		list.add(new Student1("pani",101));
		list.add(new Student1("gani",201));
		list.add(new Student1("mahi",301));
		Map<String, Integer> collect = list.stream().collect(Collectors.toMap(Student1::getName, Student1::getId));
		System.out.println(collect);
		
	}

}
