package com.interview.question;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

//Implement 2 stack in an array
public class TwoStack {
	// FOR NODE CLASS
	static class Node  {
		int data;
		Node next;
		Node (int data){
			this.data=data;
			this.next=null;
		}
	}

		public static Node head;
		public static boolean isEmpty() {
			return head == null;
		}  
		// ADD - POSITION
		public static void Push(int data) {
			Node newNode=new Node(data);
			if (head == null) {
				head=newNode; 
			}
			else {
				newNode.next = head;
				head = newNode;
			}  
		}
		// REMOVE - POSITION
		public static int Pop() {
			if (head == null) { 
				return -1;
			}
			else {
				int top = head.data;
				head=head.next;
				return top;
			}

		}
		// PEEK - POSITION
		public static int peek() {
			if (head == null) { 
				return -1;
			}
			else {
				return head.data;
			}
		}
		
		
	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<Integer>();
		TwoStack obje1=new TwoStack();
		obje1.Push(70);
		obje1.Push(30);
		obje1.Push(56);
		TwoStack obje2=new TwoStack();
		obje2.Push(75);
		obje2.Push(35);
		obje2.Push(50);
		
		while(!obje1.isEmpty()) {
			arr.add(obje1.peek());
			obje1.Pop();
		} 
		while(!obje2.isEmpty()) {
			arr.add(obje2.peek());
			obje2.Pop();
		} 
		System.out.println(arr);
	}

}