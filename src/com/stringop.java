package com;
import java.util.*;
public class stringop {
String tx ;

public  stringop() {
	
}

public void readString(String k) {
	tx = k;
}
public char caseconverter(int i) {
char ch = tx.charAt(i);

if(Character.isLowerCase(ch)) {
	ch =Character.toUpperCase(ch);
}

else if (Character.isUpperCase(ch)) {
	ch =Character.toLowerCase(ch);
}
	

	
	return ch;
	
}
public void circularCode() {
	String m ="";
	for (int i = 0; i < tx.length(); i++) {
		char ch = tx.charAt(i);
		if(ch >= 'a' && ch <='y') {
			ch= Character.toUpperCase(ch);
			
			ch +=1;
		}
		else if (ch >= 'A' && ch <='Y')  {
			ch = Character.toLowerCase(ch);
			ch+=1;
		}
		else if(ch == 'z' ) {
			ch= Character.toUpperCase(ch);
			ch -= 25;
		}
		else if ( ch == 'Z') {
			ch = Character.toLowerCase(ch);
			ch =
			ch  -=25;
		}
		
		m+= ch;
}
	
System.out.println("code is : " + m);
}
	public static void main(String[] args) {
		
		
		 stringop s = new stringop();
		 
		 s.readString("AbZ");
		 
		char ch =  s.caseconverter(0);
		 
		System.out.println(ch);
		
		 s.circularCode();
		
		
	}
	
	
}
