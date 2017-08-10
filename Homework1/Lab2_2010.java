package Homework1;

import java.util.Scanner;

public class Lab2_2010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	

		float present_gpa;
		float temp;
		// System.out.println(present_gpa);
		int total_units;
		int CS2011_units = 3;
		float CS201_gpa = 4;
		float new_gpa;
		float difference_gpa;
		String grade = "A";

		Scanner s = new Scanner(System.in);

		System.out.println("Please enter your current GPA");
		
		while (true) {
			if (s.hasNextFloat() == false) {
				System.out.println("Please enter the correct value for your GPA");
				s.next();
			}

			else {
				present_gpa = s.nextFloat();

				if (present_gpa > 4 || present_gpa < 0) {
					System.out.println("Please enter the correct value for your GPA");
				
				}

				else {
					break;
				}

			}
		}

		System.out.println("Please enter the total no. of units you have taken");
		while (true) {
			
			if(s.hasNextInt() == false){
				System.out.println("Please enter the correct value for units");
				s.next();
			}
			
			else{
				
				total_units = s.nextInt();
				
				if(total_units <0){
					System.out.println("Please enter the correct value for units");
				}
				
				else{
					break;
				}
			}
			
			
	}
		
		// System.out.println("Your total number of units are " + total_units);

		while (CS201_gpa >= 2.0) {
			// System.out.println("in the loop");

			new_gpa = ((present_gpa * total_units) + (CS2011_units * CS201_gpa)) / (total_units + CS2011_units);
			difference_gpa = (float) Math.abs(present_gpa - new_gpa);
			if (new_gpa < 2) {
				break;
			}

			System.out.println("For the grade " + grade 
					+ ", GPA "  + CS201_gpa + " in CS2011 your new GPA is " + new_gpa +
					" .Difference in old and new GPA is "
					+ difference_gpa);

			if ((Math.abs(CS201_gpa - 4) < .0001)) {
				CS201_gpa -= 0.3;
				grade = "A-";
				continue;
			}

			if ((Math.abs(CS201_gpa - 3.7) < .0001)) {
				CS201_gpa -= 0.4;
				grade = "B+";
				// System.out.println(CS201_gpa);
				continue;
			}

			if ((Math.abs(CS201_gpa - 3.3) < .0001)) {
				CS201_gpa -= 0.3;

				grade = "B";
				continue;
			}

			if ((Math.abs(CS201_gpa - 3.0) < .0001)) {
				CS201_gpa -= 0.3;
				grade = "B-";
				continue;
			}

			if ((Math.abs(CS201_gpa - 2.7) < .0001)) {
				CS201_gpa -= 0.4;
				grade = "C+";
				continue;
			}

			if ((Math.abs(CS201_gpa - 2.3) < .0001)) {
				CS201_gpa -= 0.3;
				grade = "C-";
				continue;
			}

			if ((Math.abs(CS201_gpa - 2.0) < .0001)) {
				CS201_gpa -= 0.3;
				
				continue;
			}

			// System.out.println("Again in the loop");

		}}

	}
	
	