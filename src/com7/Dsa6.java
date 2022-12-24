package com7;

import java.util.*;

public class Dsa6 {

	//printing the number of repeating the word
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the word");
		
		
		String word = sc.nextLine();
		
		int count = 0;
		
		String arr[] = word.split(" ");
		
		System.out.println(Arrays.toString(arr));
		
		

		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i+1; j < arr.length; j++) {
				
				if(arr[i].equalsIgnoreCase(arr[j])) {
					String k = arr[i];
					
						System.out.println(k);

				}
			}
		}
	}
	
}
