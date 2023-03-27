package com.interview.question;

import java.util.HashSet;
import java.util.Iterator;

//Write a Java program to find the union of two sets.
public class UnionTwoSets {
	HashSet <String> set1 = new HashSet <String>();
    HashSet <String> set2 = new HashSet <String>();
	public void sets() {
		  set1.add("Mat");
	      set1.add("Sat");
	      set1.add("Cat");
	      System.out.println("Set1 = "+ set1);
	      set2.add("Mat");
	      set2.add("Cat");
	      set2.add("Fat");
	      set2.add("Hat");
	      System.out.println("Set2 = "+ set2);
	      
	      Iterator<String> itr2=set2.iterator(); 
	      while(itr2.hasNext()){ 
	    	  set1.add(itr2.next());  
	      }
	      System.out.println("Union HashSet of Set1 = "+ set1);
		
	}

	public static void main(String[] args) {
		UnionTwoSets obj=new UnionTwoSets();
		obj.sets();
	}
}
