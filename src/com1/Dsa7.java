package com1;

import java.util.*;

public class Dsa7 {

	public static String reverse(String n) {
		String temp = n;
		String m = "";
		for (int i = temp.length()-1; i >= 0; i--) {
			char ch = temp.charAt(i);
			m += ch;
		}
		return m;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		String word = sc.nextLine();
		
		String f = "";
		StringTokenizer s = new StringTokenizer(word,"!.?,",true);
		
		while(s.hasMoreTokens()) {
	
			String k = s.nextToken();
			String m [] = k.split("[ ]");
			for(String t : m) {
		f += reverse(t)+ " ";
			}
			
		}
	System.out.println("reverse string is " + f);
	}
}
