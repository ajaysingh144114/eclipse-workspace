package com4;

import java.util.*;

public class Dsa3 {

	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		int p =sc.nextInt();
		
		int q = sc.nextInt();
		
		int i = 0;
		
		
		
		int s = 0;
		
	
		
		for ( i = p; i <=q; i++) {
			
			int temp = i;
			
		 s = i * i;
			int count = 0;
	
		while(temp > 0) {
			count++;
			temp /= 10;
			
		}

		int countDigit = (int)Math.pow(10, count);
		
		int first = s / countDigit;
		
		int second = s %countDigit;
		if((first + second)== i) {
			System.out.println("kaperkar numer is" + i);
		}
		
	}
	
}}
