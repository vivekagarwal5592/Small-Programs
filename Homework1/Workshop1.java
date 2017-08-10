package Homework1;

import java.util.Scanner;

public class Workshop1 {
	
	public  void demo_method(){
		System.out.println("Demo");
		this.demo_method2();
	}
	
	public  void demo_method2(){
		System.out.println("Demo");
		
	}

	public static void main(String[] args){
		
		
		
		double gpa;
		String gpa_s;
		Scanner user_input = new Scanner( System.in );
		
		gpa =user_input.nextDouble();
	//	gpa_s = user_input.next();
		
	//	System.out.println(gpa_s);
		
		
		
		if(gpa>=3.7){
			System.out.println("Your grade is A ");
		}
		
		else if(gpa<3.7 && gpa>=3.3){
			System.out.println("Your grade is B+");
		}
		
		else{
			System.out.println("Your grade is B");
		}
		
	}
	
}
