package com1;

import java.util.Random;
import java.util.*;
public class Dsa5 {

	public static int[][] digonalSort(int arr[][]){
		int row = arr.length;
		int col = arr[0].length;
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr.length; j++) {
				
				
				
		for (int k1 = i+ 1 , k2 = j+1; k1 < row && k2 < col;k1++, k2++) {
					if(arr[i][j] > arr[k1][k2]) {
						int temp = arr[i][j];
						arr[i][j]= arr[k1][k2];
						arr[k1][k2]=temp;
				}
			}
		}
			
		}
		return arr;
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Random rand = new Random();
		
		int m = sc.nextInt();
		
		int n = sc.nextInt();
		
		
		int[][] arr = new int[m][n];
		 

			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[0].length; j++) {
					arr[i][j] = rand.nextInt(99);
				}
			}

			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[0].length; j++) {
					System.out.print(arr[i][j] + "\t");
				}
				System.out.println();
			}
			
		digonalSort(arr);
		
		
		System.out.println("_____________________________");
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
			
		
			
	}
	
}
