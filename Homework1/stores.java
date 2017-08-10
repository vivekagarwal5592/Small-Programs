/**
 * 
 */
package Homework1;

import java.util.Scanner;

/**
 * @author Dell
 *
 */
public class stores {

	/**
	 * How many stores are there?: 5
	 * 
	 * Enter the total sales for Store 1: 1000 Enter the total sales for Store
	 * 2: 1200 Enter the total sales for Store 3: 1800 Enter the total sales for
	 * Store 4: 800 Enter the total sales for Store 5: 1900
	 * 
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How many stores are there?:");

		int stores = scan.nextInt();
		int total = 0;

		String a = "+";
		for (int i = 1; i <= stores; i++) {
			System.out.println("Enter the total sales for Store" + i);

			int sales = scan.nextInt();
			// System.out.println(sales);

			a += String.valueOf(sales) + "+";

			for (int j = 1; j <= sales; j++)

			{
				total = sales / 100;

				// System.out.println(total);

			}

		}

		System.out.println(a);
		for (int i = 0; i <= stores - 1; i++) {
			// System.out.println( a.indexOf('+'));
			String b = a.substring(1, a.indexOf('+', 1));
			a = a.substring(a.indexOf('+', 1), a.lastIndexOf('+'));
			a += "+";

			for (int j = 1; j <= (Integer.parseInt(b) / 100); j++) {
				System.out.print('*');
			}
			System.out.println();
			// System.out.println( a);

		}

		// System.out.println( a);

	}

}