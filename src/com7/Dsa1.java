package com7;

public class Dsa1 {

	public static void main(String[] args) {
//how to reverse the number in java 
		
		int s = 567;
		int rev = 0;
		while(s > 0) {
			int rem = s % 10;
			rev = rev * 10 + rem;
			s /= 10;
		}
		System.out.println("reverse number is " + rev);
	}

}
