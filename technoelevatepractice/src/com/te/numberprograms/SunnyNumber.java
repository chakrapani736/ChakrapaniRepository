package com.te.numberprograms;

import java.util.Scanner;

public class SunnyNumber {
	public static void main(String[] args) {
		System.out.print("enter any number : ");
		Scanner sn=new Scanner(System.in);
		int n=sn.nextInt();
		int m=n+1;
		isSunny(m);
	}
	public static void isSunny(int m)
	{
		for (int i = 0; i < m/2; i++) {
			if(m==i*i)
			{
				System.out.println("it is sunny");return;
			}
		}System.out.println("it is not sunny number");
		
		
	
		
			
		
	}
	

}
