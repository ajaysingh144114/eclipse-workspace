package com;

import java.util.*;
import java.util.regex.Pattern;

public class Dsa3 {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the word ");

		
		String word = sc.nextLine().toUpperCase();
		
		String m ="";
		
		StringTokenizer st = new StringTokenizer(word,",.?!",true);
		 while(st.hasMoreTokens()) {
			String s = st.nextToken();
			 String[] result = s.split("\\s");
			Arrays.sort(result);
			
			
			for (int i = 0; i < result.length; i++) {
				
				
				System.out.print(result[i] + " ");
				
				m += result[i] + " ";
				
				}
		
		
		
		
		
	}
		 
		
			
		 System.out.println();
			
String n = "";
		 
		 String[] words = m.split("[,.?! ]");

	        for(String word1 : words){
	        	
	            for(int i = 0; i < word1.length() ; i++){
	                char x = word1.charAt(0);
	                if(x == 'A' || x == 'E' || x == 'I' ||
	                   x == 'O' || x == 'U'){
	                	n+= word1+ ",";
	                    break;
	                }
	            }
			}
			
        	System.out.println(n.substring(0,n.length()-1));

			
			
			}}
			
			
		
		

