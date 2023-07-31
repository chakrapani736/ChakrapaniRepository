package com.te.streams;

import java.util.*;
import java.util.stream.Collectors;

class Person{
	String name;
	int age;
	public Person(String name, int age) {
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
	@Override
	public String toString() {
		return "Person [" + (name != null ? "name=" + name + ", " : "") + "age=" + age + "]";
	}
	public void setAge(int age) {
		this.age = age;
	}
}
public class PeoplebelongToTheirAge {
	public static void main(String[] args) {
		List<Person>list=Arrays.asList(new Person("pani",24),
			                             new Person("bijan",24),
			                             new Person("ganesh",27),
			                             new Person("pavi",24),
			                             new Person("raj",24));
		list.stream().filter(e->e.getAge()==24).forEach(System.out::println);
				
				
		
				
				
		
	}

}
