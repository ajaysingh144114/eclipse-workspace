package com6;

import java.util.*;
public class Dsa3 {

	
	//(1)+((2))+(((3)))
	//101210123321
	static int nested(String s) {
		Stack<String> m = new Stack();
		int s1= 0;
		int n = 0;
		int depth = 0;
		int maxNumParenthese=0;
		for(char c: s.toCharArray()) {
			
			if(c == '(') {
				m.push("(");
				 s1 = m.size();

			}
			else if(c == ')') {
				m.pop();
				
			}
		}
		
return s1;	
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String num = sc.nextLine();
		
		System.out.println(nested(num));
		
		
		
	}
	
	
	
}
