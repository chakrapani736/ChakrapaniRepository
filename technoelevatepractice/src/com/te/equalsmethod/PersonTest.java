package com.te.equalsmethod;

public class PersonTest {
	public static void main(String[] args) {
		Person1 person1 = new Person1(24,"pani");
		Person1 person12 = new Person1(24,"pani");
		boolean equals = person1.equals(person12);
		System.out.println(equals);
	}

}
