package com.interview.question;

import java.util.Iterator;

//Find whether an array is a subset of another array
public class SubsetArray {
	public static boolean isSubset(int []arr1, int []arr2) {
		int arrLength1=arr1.length;
		int arrLength2=arr2.length;
		int i=0;
		int j=0;
		int count=0;
		
		
		for(i=0; i< arrLength2; i++) {
			for(j=0; j< arrLength1; j++) {
				if(arr2[i] == arr1[j]) {
					count++;
					break;
				}
			}
		}
		
		if(count==arrLength2) {
			return true;
		}
		
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr1= {11,45,85,46,65,71,5};
		int []arr2= {45,85,5,71};
		
		boolean result=isSubset(arr1,arr2);
		System.out.println("The arr2 is subset of arr1 result is "+result);
	}

}
