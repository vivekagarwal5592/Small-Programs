package Lecture10;

import java.util.Scanner;

public class Array_exmple {

	public static void main(String[] args){
		
		String[] mylist = new String[5];
		Scanner s = new Scanner(System.in);
		int total = 0;
		System.out.println(mylist.length);
		
		mylist[0] = "hi"; 
		mylist[1] = "good morning";
		mylist[2] = mylist[0] + mylist[1];
		mylist[3] = "Good afternoon";
		mylist[4] = "Good day";
		
		for(int i = 0;i<=mylist.length-1;i++){
			System.out.println(mylist[i]); 
			
			
			int[] mylist1 = new int[3];
			
			
			for( i=0;i<=mylist1.length-1;i++){
				System.out.println(" Please input data fo position "+i);
				mylist1[i] = s.nextInt();
				total += mylist1[i];
			}
			
			System.out.println("Total is " + total);
			
			
			for(int  j:mylist1){
				System.out.println(i);
			}
		}
		
		method1();
		
	
	}
	
public static void method1(){
		
	}
		
	
}
