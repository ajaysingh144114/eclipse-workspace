package com;

public class Time{

	int hrs ;
	int min ;
	
	public Time() {
		this.hrs =0;
		this.min =0;
		
	}
	public void readTime(int h , int m) {
		hrs=h;
		min=m;
		
	}
	public void PrintTimes() {
		System.out.println("hrs :" + hrs);
		System.out.println("min  :" + min);
		
	}
	
	public void SumTimes() {
		 
		  
	hrs+=hrs;
	min+=min;
int totalHours= hrs;
		int totalMinutes= min;
		 
		if (totalMinutes >= 60) { 
		  totalHours ++; 
		  totalMinutes = totalMinutes % 60; 
		} 

		
		System.out.println("total hrs =" + totalHours + " hrs " + totalMinutes + " min");
	}
	
	
	public static void main(String[] args) {
		
		Time t = new Time();
		
		
		
		t.readTime(8, 35);
		
		t.PrintTimes();
		
		
		t.PrintTimes();
	
		
		t.SumTimes();
		
	}

	
}
