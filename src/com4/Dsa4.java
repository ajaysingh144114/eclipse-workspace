package com4;

import java.util.*;
public class Dsa4 {

	static int  sumDigit(int n) {
		
		int temp = n;
		int sum = 0;
		int s = 0;
		while(temp > 9) {
			
			sum = 0;
		while(temp > 0) {
			
			int rem = temp % 10;
			sum += rem;
			temp /=10;
		}
	
		 temp = sum;
		
		}
		return sum ;
		
	}
	static boolean composite(int n) {
		
		int temp = n;
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if(n % i == 0) {
				count++;
			}
			if(count > 2) 
				return true;
			
		}
		return false;
		
		
		
	}
	
	static boolean composMagic(int n) {
		
		int temp = n;
		int k = sumDigit(temp);
	
		boolean f = composite(n);
		if(k == 1 && f == true) {
			return true;
		}
	return false;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		
		int p = sc.nextInt();
		
		int q = sc.nextInt();
	for (int i = p; i <= q; i++) {
		boolean k =composMagic(i);
		if(k == true) {
			System.out.println(i);
		}
		
	}
	}
	
	
}
