package Quiz10;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		System.out.println("Enter the first complex number");
		
		Scanner scanner = new Scanner(System.in);
		
		String number1 =  scanner.nextLine();
		String[] part1 = number1.split(" ");
		System.out.println("Enter the Second complex number");
		
		String number2 =  scanner.nextLine();
		String[] part2 = number2.split(" ");
		
		
		
		Complex a = new Complex(Double.parseDouble(part1[0]),Double.parseDouble(part1[1]));
		Complex b = new Complex(Double.parseDouble(part2[0]),Double.parseDouble(part2[1]));
		

		System.out.println("(" + String.valueOf(a) +") + (" + String.valueOf(b)+ ") = "+ a.add(b));
		System.out.println("(" + String.valueOf(a) +") - (" + String.valueOf(b)+ ") = "+a.subtract(b));
		System.out.println("(" + String.valueOf(a) +") * (" + String.valueOf(b)+ ") = "+a.multiply(b));
		System.out.println("(" + String.valueOf(a) +") / (" + String.valueOf(b)+ ") = "+a.divide(b));
		System.out.println("|" + String.valueOf(a) + "|= " +a.abs());
		
	}

}
