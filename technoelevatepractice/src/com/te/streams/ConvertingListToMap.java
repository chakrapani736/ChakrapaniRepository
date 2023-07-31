package com.te.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Animal{
	String name;
	int age;
	public Animal(String name, int age) {
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
		return "Animal [" + (name != null ? "name=" + name + ", " : "") + "age=" + age + "]";
	}
}
public class ConvertingListToMap {
	public static void main(String[] args) {
		List<Animal>list=Arrays.asList(
				new Animal("tiger",12),
				new Animal("lion",16),
				new Animal("deer",11),
				new Animal("monkey",14)
				);
		Map<String, Integer> collect = list.stream().collect(Collectors.toMap(Animal::getName,Animal::getAge));
		System.out.println(collect);
	}

}
