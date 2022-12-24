package com7;

import java.util.*;

public class Dsa2 {

	
	public static void main(String[] args) {
//the programming is about the skipping the 
//last character in the programming
	Scanner sc = new Scanner(System.in);
		
	
	System.out.println("enter the word");
		
	
	String word =sc.nextLine().trim();
	
	
	
	char ch = 0;
	for (int i = 0; i < word.length(); i++) {
		
		
		ch = word.charAt(i);
		
		if(i == 0  && Character.isUpperCase(ch)) {
			 ch =Character.toLowerCase(ch);
		}
		else if (i == 0  && Character.isLowerCase(ch)) {
			ch = Character.toUpperCase(ch);
		}
		if(i == word.length()-1  && Character.isUpperCase(ch)) {
			 ch =Character.toLowerCase(ch);
		}
		else if (i == word.length()-1 && Character.isLowerCase(ch)) {
			ch = Character.toUpperCase(ch);
		}
		System.out.print(ch);
	}
	
	}
	
}
