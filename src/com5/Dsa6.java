package com5;

import java.util.*;
public class Dsa6 {
	
public static void upperCase(char str[] , int i) {
	if(i == -1) {
		return ;
	}
	if(str[i]>= 'A' && str[i]<= 'Z') {
		System.out.println(str[i]);
	}
	if(i >= 0) {
		upperCase(str,i-1);
	}
    

}
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("enter the string");
	
	String word = sc.nextLine();
	
	char ch [] = word.toCharArray();
	
	upperCase(ch, ch.length-1);
	
	
		
	}
	
	
	
	
}
