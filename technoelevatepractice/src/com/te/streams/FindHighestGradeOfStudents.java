package com.te.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
class Student
{
	String name;
	 char grade;
	public int getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	public Student(String name, char grade) {
		super();
		this.name = name;
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Student [" + (name != null ? "name=" + name + ", " : "") + "grade=" + grade + "]";
	}
	
}
public class FindHighestGradeOfStudents {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student("pani", 'D'));
		list.add(new Student("bijan", 'A'));
		list.add(new Student("ganesh", 'C'));
		
	Student student = list.stream().max(Comparator.comparing(Student::getGrade)).get();
	
	//System.out.println();
	System.out.println(student);
		
		
	}

}
