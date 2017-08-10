package Homework1;

import java.util.Random;
import java.util.Scanner;

public class prime_palindrome {

	/**
	 * 
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String user_menu = "1.Display Prime Palindromes\n" + "2.   " + " Display Mirrored Primes\n"
				+ "3.    Exit Program";

		// System.out.println(user_menu);
		System.out.println(user_menu);
		int i = scan.nextInt();

		while (i != 3) {
			// System.out.println(user_menu);
			// i = scan.nextInt();
			if (i == 1) {

				System.out.println("How many prime palindromes to display?:");
				i = scan.nextInt();
				prime_palindrome(i);

				// System.out.println(i);
			}
			if (i == 2) {

				System.out.println("How many mirrored primes to display?:");
				i = scan.nextInt();
				prime_mirrored(i);
			//	mirrored(i);

			}

			if (i == 3) {

				System.exit(0);
			}

		}

	}

	public static void prime_palindrome(int numOfPrime) // methd number 1
	{

		int numOfPrinePerLine = 10;
		int count = 0;
		int number = 2;
		while (count < numOfPrime) {
			boolean isprime = true;
			for (int divisor = 2; divisor <= number - 1; divisor++) {
				if (number % divisor == 0) {
					isprime = false;
					break;
				}
			}
			if (isprime) {
				boolean flag = palindrom(number);

				if (flag == true) {
					System.out.print(number + " ");
					count++;
				}
			}

			number++;

			// System.out.println(number);
			//
			// if(count%numOfPrinePerLine==0)
			// {
			// System.out.println(number);
			// }
			// else
			// { System.out.println(number+ "");}
		}

	}

	public static boolean palindrom(int number1)// method 2
	{
		boolean ispalindrom = true;

		// int low;
		String num = String.valueOf(number1);// convert int to string
		// int high = num.length()-1;

		for (int i = 0; i <= num.length() - 1; i++) {
			if (num.charAt(i) != num.charAt(num.length() - 1 - i)) {
				ispalindrom = false;
				return ispalindrom;
			}
		}
		return ispalindrom;

	}

	public static void prime_mirrored(int numOfPrime) // methd number 3
	{

		int numOfPrinePerLine = 10;
		int count = 0;
		int number = 2;
		while (count < numOfPrime) {
			boolean isprime = true;
			for (int divisor = 2; divisor <= number - 1; divisor++) {
				if (number % divisor == 0) {
					isprime = false;
					break;
				}
			}
			if (isprime) {
				boolean flag = mirrored(number);

				if (flag == true) {
					System.out.print(number + " ");
					count++;
				}
			}

			number++;

			// System.out.println(number);
			//
			// if(count%numOfPrinePerLine==0)
			// {
			// System.out.println(number);
			// }
			// else
			// { System.out.println(number+ "");}
		}

	}

	public static boolean mirrored(int num) { //method4

		int length = String.valueOf(num).length();
		String mirror = "";

		for (int i = 0; i <= length - 1; i++) {

			mirror += String.valueOf(num % 10);

			num /= 10;
		}

		return (test_for_prime(Integer.parseInt(mirror)));

	}

	public static boolean test_for_prime(int number) { //method5
		
		

		boolean isprime = true;
		for (int divisor = 2; divisor <= number - 1; divisor++) {
			if (number % divisor == 0) {
				isprime = false;
				break;
			}
		}

		return isprime;

	}
}
