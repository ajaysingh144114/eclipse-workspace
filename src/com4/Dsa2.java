package com4;

import java.util.*;

public class Dsa2 {

	public static void main(String[] args) {
		
		int arr[] = { 5,4,6,2,45,7};
		
		System.out.println(Arrays.toString(arr));
		
		for (int i = 1; i < arr.length; i++) {
			int current = arr[i];
			int j = i -1;
			
			while(j >= 0 && arr[j+1]<arr[j]) {
				
				arr[j+1]= arr[j];
				j--;
			}
			
			arr[j+1] = current ;
			
			
		}
			System.out.println(Arrays.toString(arr));
	}
	
	
}
