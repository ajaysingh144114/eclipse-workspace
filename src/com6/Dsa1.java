package com6;

public class Dsa1 {

	static boolean isPalindrome(int x) {
		int temp = x;
		String sum = "";
		while(temp > 0) {
			int rem = temp % 10;
			sum += String.valueOf(rem);
			temp /= 10;
		}
		
		if(sum.equalsIgnoreCase(String.valueOf(x)))
			return true;
		return false;
	}
	
	public static void main(String[] args) {
		
		System.out.println(isPalindrome(99989));
		
	}
	
	
}
