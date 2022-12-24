package com6;

import java.util.*;

public class Dsa2 {
	 static String str ;
	String newStr;
	Dsa2( ){
		
	}
	public static void readData() {
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
	}
	public static void toggle() {
		String K= "";
		for (int i = 0; i <str.length(); i++) {
		
			char ch = str.charAt(i);
			
			if(Character.isUpperCase(ch)) {
				System.out.print(Character.toLowerCase(ch));
			}
			else if(Character.isLowerCase(ch)) {
				System.out.print(Character.toUpperCase(ch));
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		Dsa2 d = new Dsa2();
		d.readData();
		d.toggle();
	}
	
	
}
