package com4;

import java.util.Arrays;
import java.util.Random;

public class Dsa1 {

	
	public static void main(String[] args) {
		
	Random rand = new Random();
		
		
		int[][] arr = new int[28][56];
		 

			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[0].length; j++) {
					arr[i][j] = rand.nextInt(100000);
				}
			}

			int max = 0;
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[0].length; j++) {
					System.out.print(arr[i][j] + "\t");
				}
				System.out.println();
			}

			
				
				int n=arr.length;
				int m=arr[0].length;
				for (int k = 0; k < n;k++) {
				for (int i = 0; i < m; i++) {
				for (int j = 0; j < m - 1 - i; j++) {
				if (arr[j][k] > arr[j + 1][k]) {
				int temp = arr[j + 1][k];
				arr[j + 1][k] = arr[j][k];
				arr[j][k] = temp;
				}
				}
				}
				}
				
				System.out.println("___________________________-------");
				
				for (int  i = 0; i < arr.length; i++) {
					for (int j = 0; j < arr[0].length; j++) {
						System.out.print(arr[i][j] + "\t");
					}
					System.out.println();
				}

				}
	
	
}
