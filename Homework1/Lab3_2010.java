package Homework1;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Lab3_2010 {

	final double PI = 3.14;

	public static void main(String[] args) {
		
	int arr[] = {3,2,1};
	int arr_copy[] = new int[3];
	
	
	
	for(int i=0;i<=arr.length-1;i++){
	System.out.print(arr[i]);
	}
	
	System.out.println();
	
	for(int i=0;i<=arr.length-1;i++){
		arr_copy[i] = arr[i];
	}
	
	
	for(int i=0;i<=arr.length-1;i++){
		System.out.print(arr_copy[i]);
		}
	
	System.out.println();
	
	arr[0] = 7;
	
	for(int i=0;i<=arr.length-1;i++){
		System.out.print(arr[i]);
		}
		
		System.out.println();
		
		for(int i=0;i<=arr.length-1;i++){
			System.out.print(arr_copy[i]);
			}
		
		System.out.println();
	
	
	
		Lab3_2010 get_value = new Lab3_2010();
		Scanner s = new Scanner(System.in);
		int option;
		double radius;
		double height;
		double largest_circumference = 0;
		double largest_sphere = 0;
		double largest_cylinder = 0;
		double cf;
		double sphere;
		double cylinder;

		boolean counter = true;
		while (counter == true) {
			
			System.out.println("Please select what do you want to do");
			System.out.println("1. Quit");
			System.out.println("2. Calculate the perimeter of a circle");
			System.out.println("3. Calculate the volume of a sphere");
			System.out.println("4. Calculate the volume of a cylinder");
			
			
			while (true) {
				if (s.hasNextInt() == false) {
					System.out.println("Please select what do you want to do");
					System.out.println("1. Quit");
					System.out.println("2. Calculate the perimeter of a circle");
					System.out.println("3. Calculate the volume of a sphere");
					System.out.println("4. Calculate the volume of a cylinder");
					s.next();
				}

				else {
					option = s.nextInt();
					if (option < 1 || option > 4) {
						System.out.println("Please select what do you want to do");
						System.out.println("1. Quit");
						System.out.println("2. Calculate the perimeter of a circle");
						System.out.println("3. Calculate the volume of a sphere");
						System.out.println("4. Calculate the volume of a cylinder");
					}

					else {
						break;
					}
				}

			}

			switch (option) {

			case 1:
				counter = false;
				break;

			case 2:
				radius = get_value.values("Radius", 0, 100.5);
				cf = get_value.circumference(radius);

				System.out.println("The circumference of the circle is " + cf);

				if (cf > largest_circumference) {
					largest_circumference = cf;
				}
				;
				break;

			case 3:
				radius = get_value.values("Radius", 0, 100.5);
				sphere = get_value.sphere(radius);

				System.out.println("The volume of the sphere is " + sphere);

				if (sphere > largest_sphere) {
					largest_sphere = sphere;
				}
				break;

			case 4:
				height = get_value.values("Height", 0, 100.5);
				radius = get_value.values("Radius", 0, 100.5);
				cylinder = get_value.cylinder(radius, height);

				System.out.println("The volume of the cylinder is " + cylinder);

				if (cylinder > largest_cylinder) {
					largest_cylinder = cylinder;
				}
				break;

			}
		}
		System.out.println("The largest circumference is " + largest_circumference);
		System.out.println("The largest sphere volume is " + largest_sphere);
		System.out.println("The largest cylinder volume is " + largest_cylinder);

	}

	public double values(String parameter, double range1, double range2) {

		Double pr;
		System.out.println("Please enter the value between " + range1 + " and " + range2 + " for the " + parameter);

		Scanner input = new Scanner(System.in);

		while (true) {
			if (input.hasNextDouble() == false) {
				System.out.println("Please enter the correct value for the " + parameter);
				input.next();

			}

			else {
				pr = input.nextDouble();
				if (pr < range1 || pr > range2) {
					System.out.println(
							"Please enter the value between " + range1 + " and " + range2 + " for the " + parameter);
					// input.next();
				} else {
					break;
				}

			}

		}

		return pr;

	}

	public double circumference(double radius) {
		double cf = 2 * PI * radius;
		return cf;
	}

	public double sphere(double radius) {
		double vol = (4 * PI * radius * radius * radius) / 3;
		return vol;
	}

	public double cylinder(double radius, double height) {
		double vol = PI * radius * radius * height;
		return vol;
	}
	
	
	public static int sumAll(int...numbers){
		int total = 0;
		for(int i: numbers)
		total += i;
		return total;
		}


}
