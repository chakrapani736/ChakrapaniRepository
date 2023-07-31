package com.te.streams;

import java.util.*;

class Students
{
	String name;
	char grade;
	public Students(String name, char grade) {
		super();
		this.name = name;
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Student [" + (name != null ? "name=" + name + ", " : "") + "grade=" + grade + "]";
	}
	
}
public class HighestGrade {
	public static void main(String[] args) {
		
	
	List<Students>list=Arrays.asList(new Students("pani",'A'),
			new Students("ram",'A'),
			new Students("ganesh",'B'),
			new Students("bijan",'D'),
			new Students("pavi",'C'));
	Students student = list.stream().max(Comparator.comparing(Students::getGrade).reversed()).get();
	System.out.println(student);
	
	}
}
