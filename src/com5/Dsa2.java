package com5;
import java.util.*;
public class Dsa2 {

	public static void main(String[] args) {
		
	
		        Scanner sc = new Scanner(System.in);
		        System.out.println("ENTER A NUMBER.");
		        int num = sc.nextInt();
		        boolean k = true;
		        int temp = num;
		        int m = num*2;
		        int n = num*3;
		        String concat = ""+temp+m+n;
		        for(char i = '1' ; i<='9' ; i++){
		            int st = concat.indexOf(i);
		         
		            int w = concat.lastIndexOf(i);
		          
		        if(st==-1||w!=st){
		            k = false;
		            break;
		        }
		        }
		        if(k==true){
		        System.out.println("FASCINATING NUMBER.");
		        }
		        else
		        {
		            System.out.println("NOT A FASCINATING NUMBER.");
		        }
		        }}
		    
	
	

