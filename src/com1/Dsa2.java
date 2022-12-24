package com1;
import java.util.*;
public class Dsa2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number");
		
		int num =  sc.nextInt();
		
		int temp = num;
		
		int sum = 0;
		if(num <= 9) {
			
			System.out.println("INVALID INPUT");
			
			return ;
		}
		else {
		while(temp > 0) {
			
			int rem = temp % 10;
			
			sum += rem;
			
			temp /= 10;
			
		}
		if(num % sum == 0) {
			System.out.println("it is the niven number");
		}
		else {
			System.out.println("it is not the niven number");
		}
	}
	
	
}
}