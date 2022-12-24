package com1;

import java.util.Random;

public class Dsa4 {

	
	public static void main(String[] args) {
		
		Random rand = new Random();
		
		
		int[][] arr = new int[3][3];
		 

			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[0].length; j++) {
					arr[i][j] = rand.nextInt(99);
				}
			}

			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					System.out.print(arr[i][j] + "\t");
				}
				System.out.println();
			}
			int f = 0;
			int k = 0;
			int c = 0;
			int min , max;
			for (int i = 0; i < arr.length; i++) {
				
				min = arr[i][0];
				c = 0;
				for (int j = 0; j < arr[0].length; j++) {
					
					if(arr[i][j]<min) {
						min = arr[i][j];
						c = j;
					}
					
				}
				
				max = arr [0][c];
				for ( k = 0; k < arr.length; k++) {
					if(arr[k][c]> max) {
						max = arr[k][c];
					}
				}
				if(min == max) {
					System.out.println("saddle point is " + min);
					f = 1;
				}
				
			
			}
			
			if(f == 0) {
				System.out.println("saddle point is not fount");
			}
		
	}
	
}
