package com7;
import java.util.*;
public class Dsa5 {
	
	public static String romIn(int k) {
		
	    int[] num = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
	    String[] rom = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
String s = "";
	    for (int i = 0; i < 13; i++) {
	        
	        while(k >= num[i]) {
	        	s += rom[i];
	        	k -= num[i];
	        }
	    }

	    return s;
	}
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
		System.out.println("enter the word");
		
		int num = sc.nextInt();
		
		String k = romIn(num);
		System.out.println(k);
	}
	
}
