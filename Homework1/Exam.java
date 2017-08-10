package Homework1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {

		String movie_name[];
		double prices[];
		int attendance[][] ;
				
			//	=  {{2,4},{5,6}}; ;

		movie_name = movie_initializer();
		prices = price_initializer();

//		for (int i = 0; i <= movie_name.length - 1; i++) {
//			System.out.println(movie_name[i]);
//		}
		
		

		attendance =attendance();

		
		for (int i = 0; i <= attendance.length - 1; i++) {
			System.out.print(movie_name[i] + " ");
			for (int j = 0; j <= attendance[i].length - 1; j++) {
				System.out.print(attendance[i][j] + " ");
				
			}
			System.out.println();
		}
		
		System.out.println("Show Prices");
		
		for (int i = 0; i <= prices.length - 1; i++) {
			System.out.println(prices[i]);
		}
		
		System.out.println("People per movie");
		for (int i = 0; i <= attendance.length - 1; i++) {
			int sum =0;
			//System.out.print(movie_name[i] + " ");
			for (int j = 0; j <= attendance[i].length - 1; j++) {
				
				sum +=  attendance[i][j];
				
			}
			System.out.println(movie_name[i] + " " + sum);
		}
		
		double highest_sales =0;
		int highest_sales_no = 0;
		System.out.println("Sales per movie");
		for (int i = 0; i <= attendance.length - 1; i++) {
			int sum =0;
			//System.out.print(movie_name[i] + " ");
			for (int j = 0; j <= attendance[i].length - 1; j++) {
				
				sum +=  attendance[i][j];
				
			}
			System.out.println(movie_name[i] + " " + sum*prices[i]);
			
			if(sum*prices[i] >  highest_sales){
				 highest_sales = sum*prices[i] ;
				 highest_sales_no  = i;
			}
			
		}
		
		System.out.println("Highest Sales: " + movie_name[highest_sales_no ]);
	}

	public static String[] movie_initializer() {

		String arr[] = null;
		Scanner scanner = new Scanner(System.in);
		String file_name = "C:\\Users\\user\\workspace\\Project1\\src\\Homework1\\movies.txt";
		File file = new File(file_name);

		try {
			Scanner file_reader = new Scanner(file);

			arr = new String[file_reader.nextInt()];

			int i = 0;
			while (file_reader.hasNext()) {
				arr[i] = file_reader.next();
				i++;
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return arr;

	}

	public static double[] price_initializer() {

		double arr[] = null;
		Scanner scanner = new Scanner(System.in);
		String file_name = "C:\\Users\\user\\workspace\\Project1\\src\\Homework1\\prices.txt";
		File file = new File(file_name);

		try {
			Scanner file_reader = new Scanner(file);

			arr = new double[file_reader.nextInt()];

			int i = 0;
			while (file_reader.hasNext()) {
				arr[i] = file_reader.nextInt();
				i++;
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return arr;

	}

	public static int[][] attendance() {

		int arr[][] = null;
		Scanner scanner = new Scanner(System.in);
		String file_name = "C:\\Users\\user\\workspace\\Project1\\src\\Homework1\\attendance.txt";
		File file = new File(file_name);

		try {
			Scanner file_reader = new Scanner(file);

			arr = new int[file_reader.nextInt()][file_reader.nextInt()];
			System.out.println("Size: "+arr[0].length);
		//	int i = 0;
			for (int i=0;i<=arr.length-1;i++) {
				//int j = 0;
				for (int j=0;j<=arr[i].length-1;j++) {
					arr[i][j] = file_reader.nextInt();
				//	file_reader.nextLine();
			//		System.out.println(String.valueOf(i) + String.valueOf(j) + arr[i][j]);
				//	j++;
				}
			//	i++;

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return arr;

	}
	
	

}
