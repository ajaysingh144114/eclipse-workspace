package com2;

import java.util.*;
public class ReverseStriing {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("enter the number");
	
	String word = sc.nextLine();
	
	char ch [] = new char[word.length()];
	
	Stack <Character> stack = new Stack<>();
	
	for (int i = 0; i < word.length(); i++) {
		stack.push(word.charAt(i));
	}
	int i = 0;

	while(!stack.isEmpty()) {
		  ch[i++] = stack.pop();
	}
	String s = new String(ch);
		
System.out.println("reversing string is " + s);

	}

}
