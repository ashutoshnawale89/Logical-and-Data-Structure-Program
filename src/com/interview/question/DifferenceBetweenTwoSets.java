package com.interview.question;

import java.util.HashSet;

// Write a program in Java to find the difference between two sets, i.e., 
// the elements that are present in one set but not in the other
public class DifferenceBetweenTwoSets {

	HashSet <String> set1 = new HashSet <String>();
    HashSet <String> set2 = new HashSet <String>();
	public void setsDifference() {
		  set1.add("Mat");
	      set1.add("Sat");
	      set1.add("Cat");
	      System.out.println("Set1 = "+ set1);
	      set2.add("Mat");
	      set2.add("Cat");
	      set2.add("Fat");
	      set2.add("Hat");
	      System.out.println("Set2 = "+ set2);
	      
	      System.out.print("Difference of Two Sets = [ ");
	      for(String entry2:set2){
	    	  int count=0;
	    	  for(String entry1:set1){
	    	  if(entry1==entry2) {
	    		  count++;
	    		  break;
	    	  }
	    	  }
	    	  if(count==0) {
	    		  System.out.print(entry2+",  ");
	    	  }
	      }
	      System.out.print("]");
	      
	      
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DifferenceBetweenTwoSets obj=new DifferenceBetweenTwoSets();
		obj.setsDifference();
	}

}
