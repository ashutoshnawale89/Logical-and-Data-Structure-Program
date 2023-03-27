package com.interview.question;

//Write a Program to Move the last element to Front in a Linked List.
public class MoveFront {
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
			// MOVE- LAST POSITION TO FIRST POSITION
			public void moveLastToFirst() {
				if (head == null) {
					return;
				}
				Node currNode = head;
				while (currNode.next != null)  {
						currNode=currNode.next;
				}
				addfirst(currNode.data);
				Node currNode2 = head;
				while (currNode2.next.next != null)  {
					currNode2 = currNode2.next;
				}
				currNode2.next=null;
					return;
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
		MoveFront list=new MoveFront();
			list.addfirst(56);
			list.addfirst(30);
			list.addfirst(70);
			list.addfirst(54);
			list.addfirst(32);
			list.addfirst(78);
			list.addfirst(556);
			list.addfirst(350);
			list.addfirst(704);
			list.printlist();
			list.moveLastToFirst();
			list.printlist();
			

	}

}
