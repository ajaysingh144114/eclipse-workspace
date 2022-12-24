package com3;

import java.util.*;

public class Dsa2 {

	public static void main(String[] args) {
		
		int [] arr = {2,5,7,8,13,14,17};
		
		int search = 7;
		
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]== search) {
				System.out.println("found");
				count++;
			}
		}
		
		
		if(count == 0) {
			System.out.println("not found");
		}
		
		
		
		
	}
	
	
	
}
