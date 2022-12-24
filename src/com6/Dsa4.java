package com6;
import java.util.*;
public class Dsa4 {

	public static String makeGood(String s) 
    {
        Stack<Character> stk=new Stack<>();
        for(char ch:s.toCharArray())
        {
            if(stk.isEmpty())
                stk.push(ch);
            else if(Math.abs((int)stk.peek()-(int)ch)==32)
                stk.pop();
            else
                stk.push(ch);
        }
        StringBuilder sb=new StringBuilder();
        for(char ch:stk)
            sb.append(ch);
        return sb.toString();
    }

	
	public static void main(String[] args) {
		String word =makeGood("AjaySiIngh");
		
		System.out.println(word);
		
	}
	
	
	
	
}
