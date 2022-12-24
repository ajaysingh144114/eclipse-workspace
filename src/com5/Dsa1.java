package com5;
import java.util.*;
public class Dsa1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Random rand = new Random();
		
		
		int row = sc.nextInt();
		
		int col = sc.nextInt();
		int arr[][] =new int[row][col];
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j]=rand.nextInt(100);
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
			
				
				int temp = arr[i][j];
				arr[i][j]= arr[j][i];
				arr[j][i]= temp;
			
			}
			
		}
		 for(int i=0;i<arr.length;i++){
	            for(int j=0;j<arr.length/2;j++){
	                int temp=arr[i][j];
	                arr[i][j]=arr[i][arr.length-1-j];
	                arr[i][arr.length-1-j]=temp;
	            }
	        }
		System.out.println("------------------------------");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
	}
	
}
