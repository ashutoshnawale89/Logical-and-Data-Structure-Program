package com.interview.question;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

//Given a map containing strings as keys and integers as values, 
//write a Java program to sort the map by values in ascending order.
public class MapAscendingOrder {
	
HashMap<String,Integer> map=new HashMap<String,Integer>();
ArrayList<Integer> arr=new ArrayList<>();

	public void ascendingOrder() {
		map.put("Ashu", 10);
		map.put("Geeta", 5);
		map.put("Nikita", 1);
		map.put("Yogesh", 18);
		map.put("Shadab", 15);
		map.put("Nitish", 9);
		//HashMap value Add to the arraylist
		 for(Entry<String, Integer> maps : map.entrySet()){
			 arr.add(maps.getValue());
		  }
		 // Sorted Arraylist
		 for(int i=0; i<arr.size()-1; i++) {
	           for(int j=0; j<arr.size()-i-1; j++) {
	               if(arr.get(j) > arr.get(j+1)) {
	                   //swap
	                   int temp = arr.get(j);
	                   arr.set(j, arr.get(j+1));
	                   arr.set(j+1 , temp);
	               }
	           }    
	       }
		 // Iteration For Sorting the Hashmap by using Arraylist
		 for(int i=0; i < map.size(); i++) {
			 for(Entry<String, Integer> maps : map.entrySet()){
				 if(arr.get(i)==maps.getValue()) {
					 System.out.println("The key for value " + maps.getValue() + " is " + maps.getKey());
					 break;
				 }
			  } 
		 } 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MapAscendingOrder obj=new MapAscendingOrder();
		obj.ascendingOrder();
	}

}
