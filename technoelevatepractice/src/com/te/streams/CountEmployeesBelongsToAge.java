package com.te.streams;

import java.util.*;
import java.util.stream.Collectors;

class Staff {
	String name;
	int age;

	public Staff(String name, int age) {
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
	public String toString() {
		return "Staff [" + (name != null ? "name=" + name + ", " : "") + "age=" + age + "]";
	}

}

public class CountEmployeesBelongsToAge {
	public static void main(String[] args) {
		List<Staff>list=Arrays.asList(
				new Staff("pani",24),
				new Staff("pavi",46),
				new Staff("mahi",23),
				new Staff("ganesh",47),
				new Staff("raji",34),
				new Staff("bijju",54),
				new Staff("pani",24)
				);
		Map<String, List<Staff>> collect = list.stream().filter(e->e.getAge()==24).collect(Collectors.groupingBy(Staff::getName));
		//System.out.println(count);
		collect.forEach((a,b)->System.out.println(a+" "+b));
	}

} 

