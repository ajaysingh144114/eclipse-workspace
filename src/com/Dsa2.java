package com;

import java.util.*;
import java.util.*;
import java.util.regex.*;
public class Dsa2 {

	public static void main(String[] args) {
		
		
		

				String st = "HELLO ! HOW ARE YOU ? I AM FINE , PLEASE COME AND ATTEND MY PARTY .";
				String s1 = "", s2 = "", s3 = "", s4 = "";
				Pattern p = Pattern.compile("[?!.,]");
				String arr[] = p.split(st);
				for (int i = 0; i < arr.length; i++) {
					s1 = arr[0];
					s2 = arr[1];
					s3 = arr[2];
					s4 = arr[3];
				}
				String st1 = "", st2 = "", st3 = "", st4 = "";
				String a1[] = s1.split(" ");
				Arrays.sort(a1);
				for (int i = 0; i < a1.length; i++) {
					st1 += a1[i];
				}
				String a2[] = s2.split(" ");
				Arrays.sort(a2);
				for (int i = 0; i < a2.length; i++) {
					st2 += a2[i] + " ";
				}
				String a3[] = s3.split(" ");
				Arrays.sort(a3);
				for (int i = 0; i < a3.length; i++) {
					st3 += a3[i] + " ";
				}
				String a4[] = s4.split(" ");
				Arrays.sort(a4);
				for (int i = 0; i < a4.length; i++) {
					st4 += a4[i] + " ";
				}
				System.out.println(st1 + "! " + st2 + "? " + st3 + "? " + st4 + ".");
			}
		}
		
