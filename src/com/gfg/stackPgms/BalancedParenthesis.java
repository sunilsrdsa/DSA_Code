package com.gfg.stackPgms;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.Stack;

public class BalancedParenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string with Parenthesis:");

		// Check if there is any input
		if (sc.hasNextLine()) {
			String str = sc.nextLine();

			if (isBalanced(str)) {
				System.out.println("The Parenthesis in the String is Balanced :");
			} else {
				System.out.println("The Parenthesis in the String is not Balanced :");
			}
		}

	}

	private static boolean isBalanced(String str) {
		// TODO Auto-generated method stub
		// Deque<Character> s = new ArrayDeque<>();
		Stack<Character> s = new Stack<>();

		for (char c : str.toCharArray()) {
			// if there are opening parenthesis push to stack
			if (c == '(' || c == '{' || c == '[') {
				s.push(c);
			} else {
				//If Stack is empty if you try to insert }]) it will be invalid
				if (s.empty()) {
					return false;
				} else if (matching(s.peek(), c) == false) {
					return false;
				} else {
					s.pop();
				}

			}

		}
		// To check the stack is empty or not true if all the parenthesis cancels out
		// and false if non valid parenthesis is there in stack
		return s.empty();
	}

	// to check top of stack has opening parenthesis and string has closing
	// parenthesis so it gets cancels out
	private static boolean matching(char a, char b) {
		// TODO Auto-generated method stub

		return ((a == '(' && b == ')') || (a == '{' && b == '}') || (a == '[' && b == ']'));
	}

}
