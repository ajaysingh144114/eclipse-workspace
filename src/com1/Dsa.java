package com1;

public class Dsa {

	
	public static void main(String[] args) {
		
		
		String name = "adiititi";
		String m = "";
		for (int i = 0; i < name.length(); i++) {
			for (int j = i+1; j < name.length(); j++) {
				if(name.charAt(i)==name.charAt(j)) {
					m+=name.charAt(j);
					
				}
				
			}
			
		}
		System.out.println(m);
	}
	
	
	
}
