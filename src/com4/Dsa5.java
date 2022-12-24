package com4;

import java.util.*;
public class Dsa5 {

	public static boolean isPrime(int num) {
		int c = 0;
		for (int i = 1; i <=num; i++) {
			if(num % i == 0) {
				c++;
			}
		}
		return c == 2;
	}
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
		
	System.out.println("enter the number");
	
	int n = sc.nextInt();
	
	if(n <= 9 || n >= 50)
	{
		System.out.println("invalid input");
		return;
	}
	if(n % 2 != 0) {
		System.out.println("inalid input");
		return;
	}
	
	int a = 3;
    int b= 0;
    
    while(a <= n/2) {
    	b= n-a;
    
	if(isPrime(a) && isPrime(b)) {
		System.out.println(a + "," + b);
	}
	a += 2;
    }
}
}