package com;
import java.util.*;
public class Dsa8 {

	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the statment");
		
		String express = sc.nextLine();
		
StringTokenizer st = new StringTokenizer(express,"+/-*",true);

int n = 1;
while(st.hasMoreTokens()) {
	
	for(char k : st.nextToken().toCharArray()) {
		System.out.println(k);
	}
	
	
}


		
		System.out.println(n);
		
	}
	
	}
