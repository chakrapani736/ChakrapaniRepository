package com.te.strings;

public class StringTest1Demo {
	public static void main(String[] args) {
		StringTest1 stringTest1 = new StringTest1();
		Thread thread=new Thread(stringTest1);
		thread.start();
	}

}
