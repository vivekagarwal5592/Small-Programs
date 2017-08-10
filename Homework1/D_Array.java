package Homework1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class D_Array {

	public static void main(String[] args) {

		boolean flag = true;
int array[][];
		while (flag) {

			Scanner scanner = new Scanner(System.in);
			int x = scanner.nextInt();
			switch (x) {

			case 1:
				array= method_random();
			case 2:

			case 3:

			}

		}

	}

	public static int[][] method_random() {

		Scanner s = new Scanner(System.in);
		int row = s.nextInt();
		int column = s.nextInt();
		int max = s.nextInt();
		int min = s.nextInt();
		Random r = new Random();
		int arr[][] = new int[row][column];

		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = 0; j <= arr[i].length - 1; j++) {
				arr[i][j] = r.nextInt(max - min) + min;
			}
		}
		
		return arr;

	}
	
	public static int[][] method_file(){
		int arr[][] = null;
		Scanner s = new Scanner(System.in);
		File file = new File(s.next());
		try {
			Scanner file_reader = new Scanner(file);
			int row = file_reader.nextInt();
			int column = file_reader.nextInt();
			 arr = new int[row][column];
			
			for(int i=0;i<=arr.length;i++){
				for(int j=0;i<=arr.length;i++){
				arr[i][j] = file_reader.nextInt();	
				}
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			return arr;
		}
		
		
		
	}
	

}
