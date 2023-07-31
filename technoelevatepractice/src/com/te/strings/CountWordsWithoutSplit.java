package com.te.strings;

public class CountWordsWithoutSplit {
	public static void main(String[] args) {
		String s = "i am java student  ";
		int count = 1;
		char ch, ch1 = 0;
		for (int i = 0; i < s.length(); i++) {
			ch = s.charAt(i);
			if(i<s.length()-1) {
			ch1 = s.charAt(i + 1);
			 
			if (((ch == ' ')) && (ch1 >= 'a' && ch1 <= 'z')) {
				count++;
			}
		}}
		System.out.println(count);

	}

}
