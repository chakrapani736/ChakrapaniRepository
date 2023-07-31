package com.te.arrays;

 class Main {
	public Main(int a) {
		System.out.println("Parent class"+a);
	}
}

class Bc extends Main {
	public Bc(int c) {
		super(c);
		System.out.println("child class"+c);
	}

}
public class MainClass{
	public static void main(String[] args) {
		Bc bc = new Bc(5);
	}
}