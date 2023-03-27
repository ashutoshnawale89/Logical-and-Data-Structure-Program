package com.interview.question;

public class BinarySearch {
	public static void binary(int arr[],int n)  {
		   int s=0;
		   for(int i=0; i < arr.length; i++) {
			   if(n==arr[i]) {
				System.out.println("The Position is "+i+" number");
				s++;
			   }
		   }
		   if(s==0) {
			   System.out.println("Number is not available in array");
		   }
	}
	public static void main(String[] args)   {  
	   BinarySearch obj=new BinarySearch();
	   int [] arr= {10,20,30,40,5,60,70,80,90,50,100};
	   obj.binary(arr, 56);
	}
}
