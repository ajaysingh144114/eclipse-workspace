package com;

import java.lang.reflect.Array;
import java.util.*;
public class Insert_Delete {
int n ;
int arr[] = new int[n];
int pos1;
int pos2;
int val;


public Insert_Delete(int insP ,int delP) {
	pos1 = insP;
	pos2 = delP;
}

public void enter(int n) {
	this.n = n;
	Scanner sc = new Scanner(System.in);
	
	for (int i = 0; i < arr.length; i++) {
		arr[i]=sc.nextInt();
	}
	
	
	}


public void disp() {
	for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
	}
}

public void insert(int v) {
	val= v;
	for (int i = 0; i < arr.length; i++) {
		arr[val]=pos1;
	}
}
public void remove() {
	
	
}
	public static void main(String[] args) {
		
	Insert_Delete s = new Insert_Delete(3,4);
	s.insert(6);
	
		
	}
	
	
	
}
