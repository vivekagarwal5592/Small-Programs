package codeeval;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("Enter the file path");
		Scanner file_path = new Scanner(System.in);
		File file = new File(file_path.next());
		String data;
		ArrayList<Integer> list = new ArrayList<Integer>();

		String[] numbers;
		try {

			Scanner read_file = new Scanner(file);

			while (read_file.hasNext()) {
				String[] k;
				data = read_file.nextLine();
				k = data.split(" ");

				for (int i = 1; i <= Integer.parseInt(k[2]); i++) {

					if (i % Integer.parseInt(k[0]) == 0 && i % Integer.parseInt(k[1]) == 0) {
						System.out.print("FB ");
					}

					else if (i % Integer.parseInt(k[0]) == 0) {
						System.out.print("F ");
					}

					else if (i % Integer.parseInt(k[1]) == 0) {
						System.out.print("B ");
					}

					else {
						System.out.print(i + " ");
					}

				}
				System.out.println("\n");

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
