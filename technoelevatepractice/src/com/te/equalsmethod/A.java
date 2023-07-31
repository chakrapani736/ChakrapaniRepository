package com.te.equalsmethod;

public class A {
	private class B
	{
		private int age;
		private String name;
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
			System.out.println("age ");
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		B b=new B();
	
	}
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.getClass());
		//B b = new B();
	}


}
