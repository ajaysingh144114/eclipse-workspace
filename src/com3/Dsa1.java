package com3;

import java.util.*;

public class Dsa1 {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number");

	int arr[] = { 6,8,3,9,7,9,10};
	
	int k = sc.nextInt();
	
	
	int count = 0;
	for (int i = 0; i < arr.length; i++) {
		if(arr[i]==k  ) {
			System.out.println("found");
	
	
	}
		else {
			count++;
		}
	if(count == 7) {
		System.out.println("NOT FOUND");
	}
	}
	}}

