package com.interview.question;

import java.util.ArrayList;
import java.util.Scanner;

//Find factorial of a large number
public class FactorialNumber {
	Scanner sc =new Scanner(System.in);
	
	  public void factorial()
	    {
		  System.out.println("Enter 3 Digit Number");
		  int n= sc.nextInt();
		  if(n > 99) {
		    ArrayList<Integer> res=new ArrayList<>();
	      
	 
	        res.add(0, 1);
	        int res_size = 1;
	 
	        
	        for (int i = 2; i <= n; i++) {
	            res_size = multiply(i, res, res_size);
	        }
	        
	        System.out.println("Factorial of given number is ");
	        for (int i = res_size - 1; i >= 0; i--) {
	            System.out.print(res.get(i));
	        }
		  }
		  else {
			  System.out.println("Enter Three Digit Number");
			  factorial();
		  }
	    }
	 
	  


		public int multiply(int x,ArrayList<Integer> res, int res_size)
	    {
	        int carry = 0; 
	 
	      
	        for (int i = 0; i < res_size; i++) {
	            int prod = res.get(i) * x + carry;
	           int res1 = prod % 10; 
	            res.set(i, res1);
	                                
	            carry = prod / 10; 
	        }
	 
	        while (carry != 0) {
	            int res2 = carry % 10;
	            res.add(res_size, res2);
	            carry = carry / 10;
	            res_size++;
	        }

	        return res_size;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactorialNumber obj=new FactorialNumber();
		obj.factorial();
		
	}

}
/*
 * 5! = 5*4*3*2*1 =120
 * Arraylist arr;
 * index          value
 * 0              1*1=1
 * 0               2*1=2
 * 0              2*3=6
 * 0              6*4=24
 * The 24 is 2 digit and remainder is 4 it will store in arr of index 0  and carry is 2
 *    it should store index of 1
 *  [0 ,1]        [4,2]
 * 24*5=120
 * The 120 is 3 digit and remainder is 0 it will store in arr of index 0  and carry is 12
 *  so iterate that remainder of 12 is 2 it will store in index 1 and 2 index is 1
 *  [0,1,2]       [0, 2,1]
 *  
 *  
*/ 




