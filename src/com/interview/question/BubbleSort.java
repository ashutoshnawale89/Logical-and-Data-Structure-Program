package com.interview.question;

public class BubbleSort {
	
	   public static void Sorting(int[]arr ) {
	       //bubble sort
	       for(int i=0; i<arr.length-1; i++) {
	           for(int j=0; j<arr.length-i-1; j++) {
	               if(arr[j] > arr[j+1]) {
	                   //swap
	                   int temp = arr[j];
	                   arr[j] = arr[j+1];
	                   arr[j+1] = temp;
	               }
	           }    
	       }
	       for(int i=0; i<arr.length; i++) {
		         System.out.print(arr[i]+" ");
		        
	       }
	       System.out.println("");
	   }    
	   public static void main(String[] args) {
		   int arr[] = {7, 8, 1, 3, 2,12,14,18};
//		   int arr2[] = {7, 8, 1, 3, 2,12,14,100};
		   BubbleSort obj=new BubbleSort();
		   obj.Sorting(arr);
//		   obj.Sorting(arr2);
	}	 
}
