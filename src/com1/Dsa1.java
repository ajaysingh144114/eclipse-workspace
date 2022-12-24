package com1;

import java.util.Iterator;
import java.util.*;
public class Dsa1 {

	
	    public static boolean checkIfPangram(String sentence) {
	        if(sentence.length() < 26) return false;
	        for(char c = 'a' ; c <= 'z'; c++){
	            if(sentence.indexOf(c) == -1){
	                return false;
	            }
	        }
	        return true;
	    }
	
	
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number");
		
		String word = sc.nextLine();
		String m = "";
		if(word.length()<26) {
			System.out.println("false");
			return ;
		}
		else {
			
			for (char i = 'a'; i <= 'z'; i++) {
				if(word.indexOf(i)==-1){
					 m = "false";
				}
				else {
					m = "true";
				}
				
			}
		}
				System.out.println(m);
	}
}
