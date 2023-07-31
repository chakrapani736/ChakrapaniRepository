package com.te.streams;

import java.util.stream.Stream;

class Employee
{
	String name;
	int sal;
	public Employee(String name, int sal) {
		super();
		this.name = name;
		this.sal = sal;
	}
}
public class StreamCreation {
	public static void main(String[] args) {
	 Employee [] employ= {new Employee("pani",1000),new Employee("ram",2000),new Employee("mani",300)};
	Stream<Employee> of = Stream.of(employ);
	of.forEach(e->System.out.println(e));
	
	}

}
