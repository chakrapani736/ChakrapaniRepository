package com.te.streamtask;

import java.util.*;
import java.util.stream.Collectors;

/*Create a program that takes a list of Employee objects as input and performs the following operations:
Filter out all employees who have joined in the last 5 years and have a performance rating of less than 8, but have a salary between 60,000 and 120,000.
Sort the remaining employees in ascending order of their salaries, and then by their years of experience in descending order.
Return a new list containing the IDs of the remaining employees, but with each ID multiplied by 10.*/
class Employee {
	int id;
	String name;
	String role;
	int sal;
	int experience;
	double rating;

	public Employee(int id, String name, String role, int sal, int experience, double rating) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
		this.sal = sal;
		this.experience = experience;
		this.rating = rating;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Employ [id=" + id + ", " + (name != null ? "name=" + name + ", " : "")
				+ (role != null ? "role=" + role + ", " : "") + "sal=" + sal + ", experience=" + experience
				+ ", rating=" + rating + "]";
	}

}

public class Task2 {
	public static void main(String[] args) {

		List<Employee> list = Arrays.asList(new Employee(100, "pani", "manager", 600000, 6, 8.0),
				new Employee(500, "nani", "client", 70000, 2, 3.0), new Employee(100, "mani", "manager", 400000, 4, 7.0),
				new Employee(200, "rani", "manager", 500000, 7, 7.5),
				new Employee(300, "vani", "developer", 300000, 2, 6.0),
				new Employee(400, "dani", "client", 100000, 1, 9.0));
		List<Employee> collect = list.stream().filter(e->e.getExperience()>5&&e.getRating()>=8&&!(e.getSal()>60000&&e.getSal()<120000)).sorted(Comparator.comparing(Employee::getSal)).sorted(Comparator.comparing(Employee::getExperience).reversed()).collect(Collectors.toList());
		System.out.println(collect);
		collect.stream().map(e->e.getId()*5).forEach(System.out::println);
		List<Employee> collect1 = list.stream().filter(e->e.getExperience()<5&&e.getRating()<8&&(e.getSal()>60000&&e.getSal()<120000)).collect(Collectors.toList());
		System.out.println(collect1);
		collect1.stream().map(e->e.getId()*5).forEach(System.out::println);
	}
}
