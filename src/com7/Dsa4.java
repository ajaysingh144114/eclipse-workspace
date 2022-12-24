package com7;

public class Dsa4 {

	public static String suffleString(String s , int[] k) {
		
		char m [] = new char[k.length];
		
		for (int i = 0; i < k.length; i++) {
			m[k[i]]= s.charAt(i);
		}
		return new String(m);
	}
	
	public static void main(String[] args) {
		int indices [] = {1,0,3,2};
		
		String p = suffleString("jaya",indices);
		
		System.out.println(p);
	}
	
	
}
