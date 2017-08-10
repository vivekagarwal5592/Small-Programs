package Homework1;

import java.util.Random;
import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {

		System.out.println("Enter the number of elements:");
		Scanner scanner = new Scanner(System.in);

		int array_size = scanner.nextInt();
		int arr[] = initialize_array(array_size);
		display_array(arr);
		display_even_indexes(arr);
		display_odd_indexes(arr);
		display_reverse_array(arr);
		display_middle_elemenet(arr);
	}

	public static int[] initialize_array(int array_size) {

		int arr[] = new int[array_size];
		Random r = new Random();
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = r.nextInt(21);
		}

		return arr;
	}

	public static void display_array(int arr[]) {

		System.out.print("Array:");
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void display_even_indexes(int arr[]) {

		System.out.print("Even Indexes:");
		for (int i = 0; i <= arr.length - 1; i++) {
			if (i % 2 == 0) {
				System.out.print(arr[i] + " ");
			}

		}
		System.out.println();
	}

	public static void display_odd_indexes(int arr[]) {

		System.out.print("Odd Indexes:");
		for (int i = 0; i <= arr.length - 1; i++) {
			if (i % 2 != 0) {
				System.out.print(arr[i] + " ");
			}

		}
		System.out.println();
	}

	public static void display_reverse_array(int arr[]) {

		System.out.print("Reverse Array:");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void display_middle_elemenet(int arr[]) {

		System.out.print("Even Indexes:");
		for (int i = 0; i <= arr.length - 1; i++) {
			if (i == 0) {
				System.out.print(arr[i] + " ");
			}

			if (i == Math.ceil(((double) arr.length - 1) / 2) || i == Math.floor(((double) arr.length - 1) / 2)) {

				System.out.print(arr[i] + " ");
			}

			if (i == arr.length - 1) {
				System.out.print(arr[i] + " ");
			}

		}
		System.out.println();
	}

}
