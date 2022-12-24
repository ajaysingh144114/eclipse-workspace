package com2;

import java.util.Arrays;
import java.util.*;
public class Dsa3 {

	public static double arrayMax(int[] input) {
	    double max = Double.NEGATIVE_INFINITY;

	    for(int cur: input)
	        max = Math.max(max, cur);

	    return max;
	}
	public static int[] countSort(int[] input ){
		int k = (int) arrayMax(input);
		  int counter[] = new int[k+1]; 
		  int[] output = new int[input.length];
	        for (int i : input)
	        { 
	        	counter[i]++; 
	        } 
	        int ndx = 0; 
	        for (int i = 0; i < counter.length; i++) {
	            while (0 < counter[i]) { 
	                output[ndx++] = i;
	                counter[i]--; 
	            }
	        }
	        return output;
	    }
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Random rand = new Random();
				
		int num = sc.nextInt();
		
		int [] input = new int[num];
				
		
		for (int i = 0; i < input.length; i++) {
			input[i]=rand.nextInt(50);
		}
		System.out.println(Arrays.toString(input));
	       int [] k =  countSort(input);
	        System.out.println("after sorting:");
	        System.out.println(Arrays.toString(k));
	}
}
