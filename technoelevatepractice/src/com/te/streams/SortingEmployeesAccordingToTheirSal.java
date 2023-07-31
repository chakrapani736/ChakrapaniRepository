package com.te.streams;

import java.util.*;

class Employ{
	String name;
	int sal;
	public Employ(String name, int sal) {
		super();
		this.name = name;
		this.sal = sal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	 @Override
	public String toString() {
		return "Employ [" + (name != null ? "name=" + name + ", " : "") + "sal=" + sal + "]";
	}
}
public class SortingEmployeesAccordingToTheirSal {
	public static void main(String[] args) {
		List<Employ>list=Arrays.asList(new Employ("pani",100),
				new Employ("pavi",400),
				new Employ("ganesh",800),
				new Employ("bijanesh",500),
				new Employ("raj",600)
				);
		list.stream().sorted(Comparator.comparing(Employ::getSal).reversed()).forEach(e->System.out.println(e));
	}

}
