package com.interview.question;

import java.util.ArrayList;
import java.util.Stack;

//Write a Program to check whether the Singly Linked list is a palindrome or not.
public class LinkedListPalindrom {
	 Node head; 

		class Node {
	        int data;
	        Node next;
	        
	        Node (int data) {    //  CONSTRUCTOR 
	        	this.data=data;
	        	this.next=null;
	        }
		}
		// ADD - FIRST POSITION
			public void addfirst(int data) {
				Node newNode=new Node(data);
				newNode.next = head;
				head = newNode;
				return;
			}
			
			public String checkPalindromOrNot() {
				boolean result=true;
				Node currNode = head;
				Stack<Integer> stack = new Stack<Integer>();
				  
		        while (currNode != null) {
		            stack.push(currNode.data);
		            currNode = currNode.next;
		        }
		        Node newNode=head;
		        while (newNode != null) {
		        	  
		            int i = stack.pop();
		            if (newNode.data == i) {
		            	result = true;
		            }
		            else {
		            	result = false;
		                break;
		            }
		            newNode = newNode.next;
		        }
				return "The LinkedList Palindrome Condition is "+result;
			}
			// PRINT METHOD
			public void printlist() {
				if (head==null) {
	        		System.out.println("The List Is Empty");
	        	}
	        	Node currnode = head;
	        	while (currnode != null) { 
	        		System.out.print(currnode.data+"->");
	        		currnode=currnode.next;
	        	}
	        	System.out.println("Null");
	        	
			}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListPalindrom list=new LinkedListPalindrom();
		list.addfirst(7);
		list.addfirst(3);
		list.addfirst(7);
		list.addfirst(5);
		list.addfirst(5);
		list.addfirst(7);
		list.addfirst(3);
		list.addfirst(6);
		list.printlist();
		System.out.println(list.checkPalindromOrNot());
		
	}

}
