package com.te.streamtask;

import java.util.*;
import java.util.stream.Collectors;

/*Write a program that reads a list of Employee objects from the user and performs the following operations:
Remove all employees who are part-time and have a salary less than 50,000, but are in the Sales or Marketing department.
Calculate the sum of the salaries of the remaining employees, but only for those who have more than 3 years of experience.
Find the average age of the remaining employees, but only for those who have a performance rating of at least 7.*/
class Worker {
	String name;
	int age;
	String jobType;
	int sal;
	String dept;
	int experience;
	double rating;
	public Worker(String name, int age, String jobType, int sal, String dept, int experience, double rating) {
		super();
		this.name = name;
		this.age = age;
		this.jobType = jobType;
		this.sal = sal;
		this.dept = dept;
		this.experience = experience;
		this.rating = rating;
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
	public String getJobType() {
		return jobType;
	}
	public void setJobType(String jobType) {
		this.jobType = jobType;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
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
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Worker [" + (name != null ? "name=" + name + ", " : "") + "age=" + age + ", "
				+ (jobType != null ? "jobType=" + jobType + ", " : "") + "sal=" + sal + ", "
				+ (dept != null ? "dept=" + dept + ", " : "") + "experience=" + experience + ", rating=" + rating + "]";
	}

	
}

public class Task3 {
	public static void main(String[] args) {
		List<Worker> list = Arrays.asList(
				// Name,job-type, salary, job-department, job-experience, ratings
				new Worker("Ram charan",17, "full", 40000, "development", 3, 8.0),
				new Worker("Dieep",15, "part-time", 30000, "development", 2, 7.5),
				new Worker("Nanda kishore",16, "part-time", 20000, "sales", 1, 7.0),
				new Worker("Kowshik",16, "full", 35000, "marketing", 2, 7.5),
				new Worker("Nikhil",15, "part-time", 80000, "sales", 8, 9.0),
				new Worker("Sreenadh",19, "full", 30000, "development", 2, 7.0),
				new Worker("venkatesh S",17, "part-time", 50000, "marketing", 3, 8.0),
				new Worker("Yashwanth",16, "part-time", 60000, "development", 2, 8.5),
				new Worker("Praveen",11, "full", 30000, "sales", 3, 7.0),
				new Worker("Dhanush",15, "part-time", 250000, "sales", 3, 6.0),
				new Worker("Yedukondalu",12, "full", 35000, "development", 3, 7.0),
				new Worker("Bhargav",14, "full", 30000, "marketing", 2, 7.0),
				new Worker("Gopi Krishna",24, "part-time", 1000, "sales", 9, 9.0),
				new Worker("Chakrapani",24, "part-time", 1000, "development", 8, 9.0),
				new Worker("Venkatesh V",25, "part-time", 2000, "marketing", 9, 9.0),
				new Worker("Sai Prathap",22, "full", 60000, "development", 3, 8.5),
				new Worker("Jaga Jeevan Ram", 24,"part-time", 3000, "marketing", 8, 8.5),
				new Worker("Chakravarthy",26, "full", 60000, "marketing", 8, 9.5),
				new Worker("Harsha",28, "full", 50000, "marketing", 7, 8.0),
				new Worker("Sreenu V",21, "part-time", 50000, "marketing", 3, 7.5),
				new Worker("Teja", 19,"part-time", 6000, "marketing", 3, 9.0),
				new Worker("Pavan D",25, "full", 7000, "marketing", 3, 8.5),
				new Worker("Rup Kumar",24, "full", 8000, "marketing", 6, 8.0));
		int reduce = list.stream().
				filter(e->!e.getJobType().equalsIgnoreCase("part-time")&&e.getSal()>=50000&&(!e.getDept().equalsIgnoreCase("sales")||!e.getDept().equalsIgnoreCase("marketing"))&&e.getExperience()>3).
				mapToInt(e->e.getSal()).reduce( 0,(a,b)->a+b);
		
		System.out.println("sum of salaries : "+reduce);
		double asDouble = list.stream().
		filter(e->!e.getJobType().equalsIgnoreCase("part-time")&&e.getSal()>=50000&&(!e.getDept().equalsIgnoreCase("sales")||!e.getDept().equalsIgnoreCase("marketing"))&&e.getRating()>=7).
		mapToDouble(e->e.getRating()).average().getAsDouble();
		System.out.println("average of ratings : "+asDouble);
		
	}

}
