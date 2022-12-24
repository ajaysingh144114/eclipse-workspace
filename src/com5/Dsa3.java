package com5;

import java.util.Scanner;
import java.util.*;
public class Dsa3 {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the string");
		
		String word = sc.nextLine();
		
		char ch = 0;
		
		String m = "";
		
		for (int i = 0; i < word.length(); i++) {
			 ch = word.charAt(i);
			
			if(ch >= 'a' && ch<= 'm') {
				ch+=13;
			}
			else if(ch >='A' && ch <= 'M') {
				ch+=13;
			}
			else if(ch >= 'n' && ch<='z' ) {
				ch-=13;
			}
			else if(ch >='N' && ch <='Z') {
				ch-=13;
			}
			 m += ch;
		}
		
		System.out.println(m);
		
		
		
	}
	
	
}
