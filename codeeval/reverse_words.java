package codeeval;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class reverse_words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		File file = new File("C:\\Users\\user\\workspace\\Project1\\src\\codeeval\\reverse_words");
		Scanner scan;
		try {
			scan = new Scanner(file);
			String data = "";
			
			while(scan.hasNextLine()){
				String arr[];
				 data = scan.nextLine();
				 
				 if(!data.isEmpty()){
					 arr = data.split(" ");
					 System.out.println(arr[1] + " " + arr[0]);
				 }
				
				
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
