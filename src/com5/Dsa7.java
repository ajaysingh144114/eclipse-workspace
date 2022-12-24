package com5;
import java.util.Scanner;
public class Dsa7 {

	
	
	    int n,rev,f;
	    Dsa7(int nn)
	    {
	        n=nn;
	        rev=0;
	        f=2;
	    }

	    int isprime(int x)
	    {
	        if(n==x)
	        {
	            return 1;
	        }
	        else if(n % x==0 || n==1)
	        {
	            return 0;
	        }
	        else
	        {
	            return isprime(x+1);
	        }
	    }
	    void isEmirp()
	    {
	        int x=n;
	        while(x!=0)
	        {
	            rev=(rev*10)+x%10;
	            x=x/10;
	        }
	        int ansl=isprime(f);
	        x=n;
	        n=rev;
	        f=2;
	        int ans2=isprime(f);
	        if(ansl==1 && ans2==1)
	        {
	            System.out.println(x+" is an Emirp number");
	        }
	        else
	        {
	            System.out.println(x+" is not an Emirp number");
	        }
	    }
	    public static void main(String args[])
	    {
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter a number");
	        int x=sc.nextInt();
	        Dsa7 obj1=new Dsa7(x);
	        obj1.isEmirp();
	    }
	}