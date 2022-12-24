package com1;

import java.util.Scanner;

public class Dsa6 {

	public static void SaddlePoint(int arr[][]){
		int c = 0;
		for (int i = 0; i < arr.length; i++) {
			int min =arr [i][0];
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] < min) {
					
					min = arr[i][j];
					c = j;
				}
			}
			int max = arr[0][c];
			for (int k = 0; k < arr[i].length; k++) {
				if(arr[k][c]>max) {
					max = arr[k][c];
				}
				
			}
			if(max == min) {
				System.out.println("saddle point is = " + min);
			}
		}
	}
public static void main(String args[]) {
	
	
	Scanner sc = new Scanner(System.in);
	
	int m = sc.nextInt();
	
	int n = sc.nextInt();
	
	
	int arr[][] = new int[m][n];
	
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length; j++) {
			arr[i][j]= sc.nextInt();
		}
	}
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length; j++) {
			
			System.out.print(arr[i][j] + "\t");
			
		}
		
		System.out.println();
		
	
	}
	
	System.out.println("----------------------");
	SaddlePoint(arr);
	
	
}

	}
	
	

