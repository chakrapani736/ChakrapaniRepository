package com.te.streamtask;

import java.util.*;
import java.util.stream.Collectors;

/*Implement a program that takes a list of Employee objects as input and performs the following operations:
Filter out all employees who have less than 3 years of experience and are not in the IT department, but have a performance rating of at least 8.
Sort the remaining employees in descending order of their performance ratings, and then by their years of experience in ascending order.
Return a new list containing the names of the remaining employees, but with each name reversed, in lowercase, and suffixed with their age.*/
class Slave {
	String name;
	int age;
	double rating;
	String dept;
	int experience;

	public Slave(String name, int age, double rating, String dept, int experience) {
		super();
		this.name = name;
		this.age = age;
		this.rating = rating;
		this.dept = dept;
		this.experience = experience;
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

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	@Override
	public String toString() {
		return "Slave [" + (name != null ? "name=" + name + ", " : "") + "age=" + age + ", rating=" + rating + ", "
				+ (dept != null ? "dept=" + dept + ", " : "") + "experience=" + experience + "]";
	}

}

public class Task5 {
	public static void main(String[] args) {
		List<Slave> list = Arrays.asList(new Slave("pani", 24, 9.0, "engineering", 3),
				new Slave("nani", 25, 7.0, "it", 5), new Slave("mani", 26, 5.0, "it", 4),
				new Slave("vani", 27, 7.0, "engineering", 2), new Slave("rani", 29, 3.0, "engineering", 8));
		list.stream().filter(e->e.getExperience()>=3&&!e.getDept().equalsIgnoreCase("it")&&e.getRating()<8).
		sorted(Comparator.comparing(Slave::getRating).reversed()).sorted(Comparator.comparing(Slave::getExperience)).map(e->new StringBuffer(e.getName()).reverse().toString()+" "+e.getAge()).forEach(System.out::println);
		
		
	}

}
