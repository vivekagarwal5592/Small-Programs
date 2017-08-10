package Homework1;

public class Lecture1 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");

		int i = 201; // 1.declaring int value
		double x = (double) i; // 1.casting int value to double

		System.out.println("1. The value of the variable in int is  " + i);
		System.out.println("1. The value of the variable in double is  " + x);
		
		double pi =  3.14159; // 2. declaring double value and casting it to int
			int yi = (int)pi;						
		
		System.out.println("2. The value of the variable in double is " + pi);
		System.out.println("2. The value of the variable in int is " + yi);
		
		// 3.Declares an int variable with the value 2147483647,
		// then adds 1. Ouput the value both before and after the addition.
		int value = 2147483647;
		System.out.println("3. Value of the variable in int before addition "+value);
		double extra_value = (double)value; // storing the value in double so that it does not exceed the limit
		extra_value +=1;
		value += 1;
		
		System.out.println("3. Value of the variable in int after addition "+value);
		System.out.println("3. Value of the variable in double after addition "+extra_value);

		// 4.Declares a boolean variable called tall and sets it to true
		// if you are at least 5' 10", otherwise false
		Boolean tall ;
		double height_person = 5.6;
		
		if(height_person>5.10){
			tall = false;
			System.out.println("4. Height is less than 5' 10'' therefore tall is "+tall);
		}
		
		if(height_person<5.10){
			tall = true;
			System.out.println("4. Height is more than 5' 10'' therefore tall is "+tall);
		}
		
		
		// 5.Declares a long variable with the value 2147483647,
		// then adds 1. Ouput the value both before and after the addition.
		long y = 2147483647;
		System.out.println("5. Value of the variable in long before addition "+y);
		y += 1;
		System.out.println("5. Value of the variable in long after addition "+y);

		// 6. Calculates the volume of a sphere this way:
		// Declares a final double called PI with the value 3.1416
		// Declares an int variable called radius and sets its value to 5
		// Uses the formula V = 4/3 PI radius 3 to calculate the volume.
		// Show the result to exactly three digits past the decimal point.

		final double PI = 3.1416;
		int radius = 5;
		double V;
		V = ((4) * PI * (radius * radius * radius)) / 3;
		System.out.print("6. Volume of the sphere with radius 5 is ");
		System.out.printf("%.3f",V);
		System.out.println();

		// 7.Converts your height in inches to your height in centimeters this
		// way:
		// Creates a final double called INCHESTOCM and sets its value to the
		// appropriate conversion constant, which is 2.54.
		// Creates a variable of type double and sets its value to your height
		// in inches. I do not care whether you tell the truth about this.
		// Calculates and outputs your height in cm. Use the formula CM = inches
		// * INCHESTOCM.

		final double INCHESTOCM = 2.54;
		double height = 67.2;
		double CM = height * INCHESTOCM;
		System.out.println("7. Height is 67.2 in Inches. The height in CM is "+CM);

		// 8.Uses the formula C = (F - 32) * 5/9 to convert
		// the following values from Fahrenheit to Celsius: -40, 0, and 212

		double[] F = { -40, 0, 212 };

		for (i = 0; i <= 2; i++) {
			Double C = (F[i] - 32) * 5 / 9;
			System.out.println("8. The value in Fahrenheit is "+ F[i]+ ". The value in celsius is "+ C);
		}

		// 9. Tests two values for divisibility by 13 this way:
		// Creates an int variable, sets its value to 143, and uses modulo to
		// determine whether the value is evenly divisible by 13
		// Assigns the new value 144 to the int variable, and uses modulo to
		// determine whether the value is evenly divisible by 13
		
		int num = 143;
		
		if(num%13 == 0){
			System.out.println("9.Number 143 is divisible by 13");
		}
		
		else{
			System.out.println("9.Number 143 is not divisible by 13");
		}
		
		num = 144;
		if(num%13 == 0){
			System.out.println("9.Number 144 is divisible by 13");
		}
		
		else{
			System.out.println("9.Number 144 is not divisible by 13");
		}
		

		// 10. Determines and outputs whether it is true that 2 * 6 is greater
		// than 10 and false that 7 is less than 5. Use a logical operator.
		
		if((((2*6) >10) == true) && ((7<5) == false)){
			System.out.println("10. It is true that 2*6 is greater than 10 and Seven is less than five");		}
		
		else{
			System.out.println("10.It is false 2*6 is greater than 10 and Seven is less than five");
		}
		
//		if((7<5) == true){
//			System.out.println("Seven is less than five");
//		}
//		
//		else{
//			System.out.println("Seven is not less than five");
//		}

		// 11. Declares variables of the appropriate types and sets them to your
		// age in years and GPA (no need to tell the truth) and determines and
		// outputs whether each of the following conditions is true. In each
		// case, use one if statement that contains a logical operator, *not*
		// nested if statements.
		//
		// a) either your age is greater than 30 or your GPA is greater than 3.5
		// b) your age is greater than 30 *and* your GPA is also greater than
		// 3.5.
		// c) either your age is not greater than 30 or your GPA is not greater
		// than 3.5.
		// d) your age is greater than 30 but your GPA is not greater than 3.5.
		
		int age = 24;
		int GPA = 4;
		
		if(age>30 || GPA >3.5){
			System.out.println("11.Your age is greater than 30 or your GPA is greater than 3.5");
		}
		
		
		if(age>30 && GPA >3.5){
			System.out.println("11.Your age is greater than 30 and your GPA is greater than 3.5");
		}
		
		if(age<30 || GPA <3.5){
			System.out.println("11. Either Your age is not greater than 30 or your GPA is not greater than 3.5");
		}
		
		if(age>30 && GPA <3.5){
			System.out.println("11.Your age is greater than 30 but your GPA is not greater than 3.5");
		}

	}
	
	

}
