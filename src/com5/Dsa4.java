package com5;

import java.util.*;

public class Dsa4 {

     
	public static void main(String[] args) {
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
	
		  for(int i = 0; i < arr.length; i++){    
              for(int j = 0; j < arr[0].length; j++){    
                if(j > i)    
                 if(arr[i][j]!=0) {
                	 System.out.println("it is not the lower tringular matrix");
                	 break;
                 }
                else {
                	System.out.println("it is the lower tringular matrix");
                	break;
                }
                   
            }    
            System.out.println();    
        }    
    }    
	}

		
		
		

	    
	
		
		
	
	
	

