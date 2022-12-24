package com6;

public class LinkedList {

	Node head;
	static class Node{
		int value ;
		Node next;
		
	Node(int d){
		value = d;
		next = null ;
	}
	}
	
	public static void main(String[] args) {
		
		LinkedList linkedlist = new LinkedList();
		
		linkedlist.head= new Node(1);
		
		Node second = new Node(2);
		
		Node third  = new Node(3);
		
		Node fourth = new Node(4);
		
		linkedlist.head.next =  second;
		
		second.next = third ;
		
		third.next = fourth;
		
		fourth.next = null;
		
		while(linkedlist.head != null) {
			System.out.print(linkedlist.head.value + " ");
			linkedlist.head = linkedlist.head.next;
		}
			
		
		
		
	}
	
}
