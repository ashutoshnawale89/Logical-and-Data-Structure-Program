package com.interview.question;

import java.util.HashSet;
import java.util.Iterator;

// Given two sets containing integers, write a program in
//  Java to find the intersection of the sets.
public class IntersectionTwoSets {

	HashSet <String> set1 = new HashSet <String>();
    HashSet <String> set2 = new HashSet <String>();
	public void setsIntersection() {
		  set1.add("Mat");
	      set1.add("Sat");
	      set1.add("Cat");
	      System.out.println("Set1 = "+ set1);
	      set2.add("Mat");
	      set2.add("Cat");
	      set2.add("Fat");
	      set2.add("Hat");
	      System.out.println("Set2 = "+ set2);
	      
	      System.out.print("Intersection = [ ");
	      for(String entry1:set1){
	    	  for(String entry2:set2){
	    	  if(entry1==entry2) {
	    		  System.out.print(entry1+",  ");
	    		  break;
	    	  }
	    	  }
	      }
	      System.out.print("]");
	      
	      
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntersectionTwoSets obj =new IntersectionTwoSets();
		obj.setsIntersection();

	}

}
