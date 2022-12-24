package com;

import java.util.*;
public class Dsa5 {
	public static String capiWord(String str){  
	    String words[]=str.split("\\s");  
	    String capitalizeWord="";  
	    for(String w:words){  
	        String first=w.substring(0,1);  
	        String afterfirst=w.substring(1);  
	        capitalizeWord+=first.toUpperCase()+afterfirst+" ";  
	    }  
	    return capitalizeWord.trim();  
	}  
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	String encode = sc.nextLine().toUpperCase();
	encode = encode.trim();
		String s = "";
	   int count = 0;
	   String target = "KK";
	   String replacement = " ";
	   String processed = encode.replace(target, replacement);

	    encode = encode.replaceAll("\\d+","");
		for (int i = 0; i < processed.length(); i++) {
			char ch = processed.charAt(i);
				
		if(Character.isUpperCase(ch) || ch== ' ') {
			if(ch >='A' && ch <= 'X')
					ch += 2;
				else if( ch >= 'Y' ) {
					ch -= 24;
				}
				 s += ch;
				 s = s.replaceAll("  ", " ");
			}
			
		}
		
		s= s.toLowerCase();
		 s =  capiWord(s);
		 System.out.println(s);
	}
}

