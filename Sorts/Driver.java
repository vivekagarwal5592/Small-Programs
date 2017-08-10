package Sorts;

import java.util.Random;

public class Driver {

	public static void main(String[] args) {

		Random r = new Random();
		int[] arr1 = new int[50000];
		long[] sorts =  new long[10];
		for (int i = 0; i <= 50000; i++) {
			arr1[i] = r.nextInt();
		}

		Driver driver = new Driver();

		sorts[0] = bubbleSort(arr1);
	
		//do for remaining sorts and plot on graph using javafx
	}

	public static long bubbleSort(int[] list) {

		long starttime = System.currentTimeMillis();
		boolean needNextPass = true;

		for (int k = 1; k < list.length && needNextPass; k++) {
			// Array may be sorted and next pass not needed
			needNextPass = false;
			for (int i = 0; i < list.length - k; i++) {

				if (list[i] > list[i + 1]) {
					// Swap list[i] with list[i + 1]
					int temp = list[i];
					list[i] = list[i + 1];
					list[i + 1] = temp;

					needNextPass = true; // Next pass still needed
				}
			}
		}

		long endtime = System.currentTimeMillis();

		return endtime - starttime;

	}

}
