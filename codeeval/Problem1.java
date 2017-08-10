package codeeval;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		
		System.out.println("Enter the file path");
		Scanner file_path = new Scanner(System.in);
		File file = new File(file_path.next());
		String data ;
		ArrayList<Integer> list = new ArrayList<Integer>();
		String[] k = new String[2];
		String[] numbers;
		try {
			
			Scanner read_file = new Scanner(file);
			
//			while(read_file.hasNext()){
				
				data = read_file.next();
				
				
//			}
			
			k = data.split(";");
			data = k[0];
			numbers = data.split(",");
			
		//	System.out.println(k[1] +"\n\n\n\n");
			
			for(int i=0;i<=(Integer.parseInt(k[1])-1)/2;i++){
//				System.out.println(list.size());
//				System.out.println(list.get(i) + "\n");
				
				String temp = numbers[Integer.parseInt(k[1]) -i-1];
				numbers[Integer.parseInt(k[1]) -i-1] = numbers[i];
				numbers[i] = temp;
//				System.out.println("I am here");
//				System.out.println(numbers[i]);
//				System.out.println(numbers[Integer.parseInt(k[1]) -i-1] +"\n\n\n\n");
				
			}
			
			for(int i=0;i<=numbers.length-1;i++){
				System.out.println(numbers[i]);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
