package Exam;

import java.util.Random;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int row = scanner.nextInt();
		int column = scanner.nextInt();

		int arr[][] = arr_set(row, column);

		print_arr(arr);
		System.out.println(sum_arr(arr));
		avg_arr(arr);
		 min_col_arr(arr);
	}

	public static int[][] arr_set(int row, int column) {

		int arr[][] = new int[row][column];

		Random r = new Random();

		for (int i = 0; i <= arr.length-1; i++) {
			for (int j = 0; j <= arr[i].length-1; j++) {
				arr[i][j] = r.nextInt(30) + 20;
			}
		}

		return arr;

	}

	public static void print_arr(int arr[][]) {
 System.out.println("Array");
		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = 0; j <= arr[i].length - 1; j++) {
				System.out.print(arr[i][j] + " " );
			}
		}

		System.out.println();
	}

	public static int sum_arr(int arr[][]) {
		 System.out.println("Sum");
		int sum = 0;
		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = 0; j <= arr[i].length - 1; j++) {
				sum += arr[i][j];
			}
		}
		return sum;

	}

	public static void avg_arr(int arr[][]) {
		 System.out.println("Average");
		for (int i = 0; i <= arr.length - 1; i++) {
			int sum = 0;
			for (int j = 0; j <= arr[i].length-1; j++) {
				sum += arr[i][j];
			}

			System.out.println((double) sum / arr.length);
		}

	}

	 public static void min_col_arr(int arr[][]) {
	System.out.println("Column");
	 int col_no = 0;
	 double avg[] = new double[arr.length];
	 for (int i = 0; i <= arr.length-1; i++) {
	 int sum =0;
	
	 for (int j = 0; j <= arr.length-1; j++) {
	 sum += arr[j][i];
	 }
	
	avg[i] = (double) sum / arr.length;
	
	 }
	 
	 double min_avg = avg[0];
	 int col = 0;
	for(int i=0;i<=avg.length-1;i++){
		if(avg[i] <min_avg){
			min_avg = avg[i];
			col =i;
		}
	}
	System.out.println(min_avg );
	System.out.println(col);
	
	 }

}
