package com.te.streamtask;

import java.util.*;
import java.util.stream.Collectors;

/*Write a program that reads a list of Employee objects from the user and performs the following operations:
Filter out all employees who have a salary greater than 150,000 and are in the Engineering department, but have joined in the last 4 years.
Calculate the square root of the sum of the salaries of the remaining employees, but only for those who have a performance rating of at least 9.
Find the employee with the closest years of experience to the square root, but only if their age is less than 40.
*/
class JobHolder {
	String name;
	int age;
	int experience;
	int sal;
	double rating;
	String dept;

	public JobHolder(String name, int age, int experience, int sal, double rating, String dept) {
		super();
		this.name = name;
		this.age = age;
		this.experience = experience;
		this.sal = sal;
		this.rating = rating;
		this.dept = dept;
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

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
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

	@Override
	public String toString() {
		return "JobHolder [" + (name != null ? "name=" + name + ", " : "") + "age=" + age + ", experience=" + experience
				+ ", sal=" + sal + ", rating=" + rating + ", " + (dept != null ? "dept=" + dept : "") + "]";
	}

}

public class Task4 {
	public static void main(String[] args) {
		List<JobHolder> list = Arrays.asList(new JobHolder("pani", 24, 5, 20000, 9.0, "degree"),
				new JobHolder("dani", 45, 7, 30000, 10.0, "engineering"),
				new JobHolder("vani", 56, 8, 25000, 8.0, "engineering"),
				new JobHolder("nani", 64, 4, 40000, 10.0, "degree"),
				new JobHolder("mani", 74, 9, 350000, 10.0, "engineering"));
		int reduce = list.stream()
				.filter(e -> !(e.getSal() > 150000) && !e.getDept().equalsIgnoreCase("engineering")
						&& !(e.getExperience() <= 4) && e.getRating() >= 9)
				.mapToInt(e -> e.getSal()).reduce(0, (a, b) -> a + b);
		System.out.println("sum of jobHolders is : " + Math.sqrt(reduce));
		List<JobHolder> collect = list.stream().filter(e -> e.getAge() > 40).collect(Collectors.toList());
		collect.stream().map(e -> e.getName() + " " + Math.round(Math.sqrt(e.getRating())))
				.forEach(System.out::println);
		;

	}

}
