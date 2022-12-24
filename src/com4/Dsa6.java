package com4;

public class Dsa6 {

	public static void main(String[] args) {
		
		int arr [][] = {{1,2,3},{4,5,6},{7,8,9}};
		int row = 3;
		int col = 3;
		int top = 0; int down = row-1;
		int left = 0; int right= col-1;
		int dir = 0;
		while(top <= down && left <= right) {
			if(dir ==0) {
				for (int i = top; i <=right; i++) 
					System.out.print(arr[top][i] + " ");
				
				top++;
			}
				else if (dir ==1) {
					for (int i = top ; i <= down; i++) 
						System.out.print(arr[i][right] + " ");
					right--;
				}
			
					else if(dir ==2){
						for (int i = right; i >=left; i--) 
							System.out.print(arr[down][i]+ " ");
						down--;
					}
					else if(dir ==3) {
						for (int i = down; i >=top; i--) 
							System.out.print(arr[i][left] + " ");
						left++;
				}
			dir = (dir + 1)%4;
			}
		
		}
		
	}
	
	

