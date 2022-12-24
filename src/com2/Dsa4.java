package com2;

import java.util.Random;
import java.util.Scanner;

public class Dsa4 {

	
		
		
	
	public static void main(String[] args) {
		Random rand = new Random();
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number ");
		
		int n = sc.nextInt();
		
		int m = sc.nextInt();
		
		int [][] arr = new int[n][m];
		
		for (int i = 0; i < n; i++) {
		
			for (int j = 0; j < m; j++) {
				arr[i][j] = rand.nextInt(30);
			}
		}
		for (int i = 0; i < n; i++) {
			
			for (int j = 0; j < m; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("-----------------------------");

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
if(i == 0 || j == 0 || i == n-1|| j == m-1) {
	System.out.print(arr[i][j] + "\t");
}
else {
	System.out.print("\t");
}
			}
			System.out.println();
		}
		
	}
				
	}
	


	
