package com3;

public class Dsa3 {
//binary search 
	public static void main(String[] args) {
		
		int [] arr = {2,4,7,9,13,15};
		
		int search = 18;
		
		int left = 0;
		int right = 5;
		
		int c = 0;
		while(left <= right) {
			int mid = (left + right)/2;
			
			if(arr[mid] == search) {
				System.out.println("found");
				c++;
			}
			if(arr[mid] < search) {
				left = mid+ 1;
			}
			else {
				right = mid-1;
			}
		}
		if(c ==0) {
			System.out.println("not found");
		}
	}
	
	
}
