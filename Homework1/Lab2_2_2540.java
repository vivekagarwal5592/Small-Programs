package Homework1;

import java.util.Scanner;

public class Lab2_2_2540 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number ;
		System.out.println("Enter the number");
		Scanner s = new Scanner( System.in);
		number = s.nextInt();
		
		for(int i =2;i<=number;i++){
			
			if(number ==1){
				System.out.println("1 is neither prime nor composite");
				break;
			}
			
			if(i==number){
				System.out.print("The number is prime");
				break;
			}
			
			if(number%i == 0){
				System.out.print("The number is not prime");
				break;
			}
			
			
			
		}

	}

}
