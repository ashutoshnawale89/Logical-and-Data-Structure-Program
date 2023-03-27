package com.interview.question;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

//Write a program in Java to remove all the entries from
// a map whose keys are divisible by 5
public class RemoveEntryDivisibleByFive {
	
	HashMap<Integer,String> map=new HashMap<Integer,String>();
	
	public void divisibleBYFive() {
		map.put(10,"Ashu");
		map.put(4,"Geeta");
		map.put(3,"Nikita");
		map.put(15,"Yogesh");
		map.put(22,"Shadab");
		map.put(56,"Nitish");
		ArrayList<Integer> arr=new ArrayList<>();
			 for(Map.Entry maps : map.entrySet()){			
					arr.add((Integer) maps.getKey());		 
			  }
			 
			 for(int i=0; i < arr.size();i++) {
				 if(arr.get(i)%5==0) {
					 map.remove(arr.get(i));
				 }
			 }
			 for(Map.Entry maps : map.entrySet()){		
				 System.out.println("The key for value " + maps.getValue() + " is " + maps.getKey());
			 }

		   
	}
	
public static void main(String[] args) {
	RemoveEntryDivisibleByFive obj=new RemoveEntryDivisibleByFive();
	obj.divisibleBYFive();
}
}
