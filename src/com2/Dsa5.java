package com2;

import java.util.*;

public class Dsa5 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number");
		
		
		String word = sc.nextLine();
		
		Stack  stack = new Stack();
		
		char [] arr = new char[word.length()];
		for (int i = 0; i < word.length()
				; i++) {
			stack.push(word.charAt(i));
			
			
			
		}
		System.out.println(stack);
		
			}
	
	
}
