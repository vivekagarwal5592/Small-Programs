package Homework1;

import java.util.Scanner;

public class Lab2_1_2540 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int x = 3; 

		  int  y = 3; 

		    switch (x + 3) 

		    { 
		      case 6: y=1; 
		      default: y += 1; 

		    } 

		System.out.println(y);


		//double y = 52.25;

		System.out.println( y % 10); 
		
	//	double x = 10.0/7.0;
		 
		System.out.println(x);
		String value ;
		Scanner s = new Scanner( System.in);
		int i,j;
		System.out.println("Enter the String");
		value = s.next();
		value = value.toLowerCase();
		
		
		for( i = 0,  j=value.length()-1;i<=(value.length()-1)/2;i++,j--){
			
			if(value.charAt(i) ==  value.charAt(j)){
		//		System.out.println(value.charAt(i) + " " + value.charAt(j) );
			//	System.out.println(i);
				//System.out.println(j);
				
				if(i ==(value.length()-1)/2){
					System.out.println("The given string is palindrome");
				}
			}
			
			else{
				System.out.println("The given string is not Palindrome");
				break;
			}
			
		//	System.out.println(i + " " + j);
	//	System.out.println(j);
		}
		
		

	}

}
