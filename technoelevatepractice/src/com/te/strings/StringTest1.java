package com.te.strings;

public class StringTest1 implements Runnable{
	
	@Override
	public void run() {
	 int count=0,count2=0;
		String s="my name is pani";
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			if(ch>='a'&&ch<='z') {
				count++;
			}
		}for (int i = 2; i < count; i++) {
			if(count%i==0)
			{
				count2++;
			}
			
		}if(count2==0)
		{
			System.out.println("this is prime number");
		}
		else {
			System.out.println("this is not prime number");
		}
	}
	
	

}
