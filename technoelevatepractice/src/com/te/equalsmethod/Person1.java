package com.te.equalsmethod;

public class Person1{
	int age;
	String name;
	public Person1(int age, String name) {
		
		this.age = age;
		this.name = name;
	}
	public boolean equals(Person1 p)
	{
		boolean result;
		if((p==null)||(getClass()!=p.getClass()))
		{
			return result=false;
		}
		else
		{
			//Person1 p1=(Person1)p;
			result=name.equals(p.name)&&age==p.age;
		}return result;
	}
	

}
