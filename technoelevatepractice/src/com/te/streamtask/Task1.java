package com.te.streamtask;

import java.util.*;
import java.util.stream.Collectors;

class Employ {
	String name;
	String role;
	int sal;
	int experience;
	double rating;
	public Employ(String name, String role, int sal, int experience, double rating) {
		super();
		this.name = name;
		this.role = role;
		this.sal = sal;
		this.experience = experience;
		this.rating = rating;
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
		return "Employ [" + (name != null ? "name=" + name + ", " : "") + (role != null ? "role=" + role + ", " : "")
				+ "sal=" + sal + ", experience=" + experience + ", rating=" + rating + "]";
	}

	
}

public class Task1 {
	public static void main(String[] args) {
		
		List<Employ> list = Arrays.asList(new Employ("pani", "manager", 200000, 4,3.5),
				new Employ("nani", "clerk", 200000, 4,4.5), new Employ("vani", "developer", 30000, 2,4.0),
				 new Employ("vani", "developer", 30000, 2,4.0),
				new Employ("rani", "manager", 200000, 4,2.5), new Employ("mani", "clerk", 20000, 2,3.0));
			List<Employ> collect = list.stream().filter(e->!(e.getRole().equalsIgnoreCase("manager"))&&e.getExperience()<3&&e.getSal()<100000).sorted(Comparator.comparing(Employ::getExperience).reversed()).sorted(Comparator.comparing(Employ::getRating)).collect(Collectors.toList());
			System.out.println(collect);
			collect.stream().map(e->e.getName().toUpperCase()).map(e->new StringBuffer(e).reverse().toString()).forEach(System.out::println);
	}

}
