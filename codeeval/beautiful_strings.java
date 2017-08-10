package codeeval;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class beautiful_strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("C:\\Users\\user\\workspace\\Project1\\src\\codeeval\\beautiful_strings.txt");
		Scanner scan;

		try {
			scan = new Scanner(file);
			String data = "";

			while (scan.hasNext()) {
				int list_of_alphabets[] = new int[26];
				int sum = 0;
				data = scan.nextLine();
				data = data.toLowerCase();
				for (int i = 0; i <= data.length() - 1; i++) {

					if (data.charAt(i) >= 'a' && data.charAt(i) <= 'z') {
						// sum+= (int)data.charAt(i)-96;
						list_of_alphabets[(int) data.charAt(i) - 97] += 1;
					}
				}

				for (int j = 0; j <= list_of_alphabets.length - 1; j++) {
					for (int k = j + 1; k <= list_of_alphabets.length - 1; k++) {
						if (list_of_alphabets[j] < list_of_alphabets[k]) {
							int temp = list_of_alphabets[j];
							list_of_alphabets[j] = list_of_alphabets[k];
							list_of_alphabets[k] = temp;
						}
					}
				}

				int counter = 26;
				for (int k = 0; k <= list_of_alphabets.length - 1; k++) {
					sum += list_of_alphabets[k] * counter;
					counter--;
				}

				System.out.println(sum);

			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
