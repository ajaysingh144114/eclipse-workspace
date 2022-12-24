package com;

import java.io.BufferedReader;
import java.util.*;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.*;
public class expression {

	
	
	
		Scanner sc=new Scanner(System.in);
		String expn; int c; long f; long s; char ch;
		expression()
		{
		expn= "";
		}
		void inputexp(String ex)
		{
		expn=ex;
		}
		long getfinalval() {
		long t = 1;
		String k [] =expn.split("[*]");
		for (int i = 0; i < k.length; i++) {
			String s = k[i];
			
			long m = Long.parseLong(s);
			 
			t = t *  m;
			
		}
		return t;
		}
		public static void main(String[] args)  {
			
			expression obj=new expression();
			obj.inputexp("15*4");
			int l=(int)obj.getfinalval();
			System.out.println(l);
	}
	
}
