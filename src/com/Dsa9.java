package com;

import java.util.*;

public class Dsa9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the word");
		
	   String word = sc.nextLine();
	   
	   String k[] = word.split("[ ]");
	   
	   String l =  null;
	   
	 int   count = 0;
	 
	 int  n = 0;
	
	   for(String s : k) {
		int  len = s.length();
		if(n < len) {
			
			l = s;
			
			
		}
	   }
	   String m= "";
	   int p = l.length();
		for(String t : k) {
			if(l.length() == t.length()) {
				m+=t + ",";
			}
		}
		System.out.println(m);
	}
	
	
	
	
}
