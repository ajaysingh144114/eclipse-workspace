package com;
import java.util.*;
public class Dsa1 {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number ");
		String word = sc.nextLine();
		
		if(word.length()<=3 && word.length()<100) {
			System.out.println("INVALID INPUT");
			return;
		}
		
		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
            if    
            (c >= 'a' && c <= 'm') c += 13;
            else if  (c >= 'A' && c <= 'M') c += 13;
            else if  (c >= 'n' && c <= 'z') c -= 13;
            else if  (c >= 'N' && c <= 'Z') c -= 13;
            System.out.print(c);
		
		}
		
	}
	
}
