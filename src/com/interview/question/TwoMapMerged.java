package com.interview.question;

import java.util.HashMap;
import java.util.Map;

//Given two maps, write a Java program to merge them into a single map such that
// if a key is present in both the maps,the value in the second map should overwrite 
// the value in the first map.
public class TwoMapMerged {
	
	HashMap<Integer,String> map1=new HashMap<Integer,String>();
	HashMap<Integer,String> map2=new HashMap<Integer,String>();
	
	public void addHashMap() {
		map1.put(10,"Ashu");
		map1.put(4,"Geeta");
		map1.put(3,"Nikita");
		map1.put(15,"Yogesh");
		map1.put(22,"Shadab");
		map1.put(56,"Nitish");
	
		map2.put(10,"Ashu");
		map2.put(4,"Ramai");
		map2.put(3,"Patil");
		map2.put(15,"Dhangar");
		map2.put(22,"Hussain");
		map2.put(56,"Priyadarshi");
		
		overWriteMethod();
	}	
	public void overWriteMethod() {
		
		
		for(Map.Entry maps : map1.entrySet()){
			for(Map.Entry entry : map2.entrySet()){
				if(maps.getKey()== entry.getKey()) {
			    	String value1=(String) maps.getValue();
			    	String value2=(String) entry.getValue();
			    	if(!value1.equals(value2)) {
					String value3=value1.concat(value2);  
					entry.setValue(value3);
			    	}
			    }
			}
		}
		System.out.println(map2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		TwoMapMerged obj=new TwoMapMerged();
		obj.addHashMap();
	}

}
