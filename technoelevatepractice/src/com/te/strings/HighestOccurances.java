package com.te.strings;

public class HighestOccurances {
	public static void main(String[] args) {
		String name="deeppptttheit";int count1=1;
		for (int i = 0; i < name.length(); i++) {
			char ch=name.charAt(i);int count=1;
			for (int j = i+1; j <name.length() ; j++) {
				
				char ch1=name.charAt(j);
				if(ch==ch1)
				{
					count++;
				}
			}if(count>count1)
			{
				
				count1=count;
				System.out.println(ch+" occured "+count1+" times");
			}
			
		}
	}

}
