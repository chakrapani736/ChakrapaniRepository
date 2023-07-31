package com.te.strings;

import java.util.Stack;

public class BalancedString {
	public static void main(String[] args) {
		String s = "{[()]}";
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == '(' || ch == '[' || ch == '{') {
				stack.push(ch);

			} else if ((!stack.isEmpty()) && ((ch == ')' && stack.pop() == ')') || (ch == ']' && stack.pop() == '[')
					|| (ch == '}' && stack.pop() == '{'))) {
				stack.pop();
			}

		}
		if (!stack.isEmpty())
			System.out.println("not balanced");
		else
			System.out.println("balanced");
	}

}
