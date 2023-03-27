package com.interview.question;

import java.util.LinkedList;

//Find the middle Element of a linked list.
public class LinkedListMiddleElement {
	  Node head; 
	  int count=0;
	  int middleElemet=0;
		
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
				count++;
				return;
			}
			// ADD - LAST POSITION
		public void addlast(int data) {
			Node newNode= new Node(data);
			if (head == null) {
				head=newNode;
			}
			Node currNode = head;
			while (currNode.next != null)  {
				currNode = currNode.next;
			}
				currNode.next = newNode;
				count++;
				return;
		}
		 // PRINT METHOD
		public void printlist() {
		     if (head == null) {
		    	 System.out.println("List is Empty");
		     }
		     Node currNode = head;
				while (currNode != null)  {
					
					System.out.print(currNode.data +"->" );
					currNode = currNode.next;
					
				}
				System.out.println("null");
				
				}
		public void deletefirst() {
			if (head==null) {
				System.out.println("The list is Empty");
			}
			else {
				head=head.next;
			}
		}
			
	      public static void main(String[] args) {
	    	  LinkedListMiddleElement list=new LinkedListMiddleElement();
				list.addfirst(56);
				list.addlast(30);
				list.addlast(70);
				list.addfirst(54);
				list.addlast(32);
				list.addlast(78);
				list.addfirst(556);
				list.addlast(350);
				list.addlast(704);
				list.printlist();
				list.deletefirst();
				list.printlist();
			}
	}