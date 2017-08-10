package Postfix;

import java.util.Scanner;
import java.util.Stack;

public class Conversion {

	public static void main(String[] args) {

		String val = "2 + 3 * 4 - 1 / 7";
		String val2 = "";
		Stack<Integer> stack = new Stack<Integer>();

		Scanner scanner = new Scanner(val);

		while (scanner.hasNext()) {

			if (scanner.hasNextInt()) {
				if (stack.isEmpty()) {
					stack.push(scanner.nextInt());
				} else {
				//	val2 += 
							
							System.out.print(String.valueOf(stack.pop()) + " " + String.valueOf(scanner.nextInt()) + " ");
				}

			} else {
				switch (scanner.next()) {

				case "+":
					System.out.print("+");
				//	val2 += "+";
					break;

				case "-":
					System.out.print("-");
				//	val2 += "-";
					break;
				case "*":
					System.out.print("*");
				//	val2 += "*";
					break;
				case "/":
					System.out.print("/");
				//	val2 += "/";
					break;
				}
			}
		}

		System.out.println(val2);

	}

}
