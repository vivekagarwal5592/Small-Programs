package Homework1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class dictionary {

	public static void main(String[] args) throws IOException {
		
	//	File file = new File("C:\\Users\\user\\Desktop\\dictionary_meaning.txt");
		File file2 = new File("C:\\Users\\user\\Desktop\\a.csv");
		String arr[] = null;
		
		Scanner scanner = new Scanner(file2);
	//	BufferedWriter bufferedwriter = new BufferedWriter(new FileWriter(file2));
		
		while(scanner.hasNextLine()){
	//		System.out.println("ddddddddddddddd");
		String data = scanner.nextLine();
		
		arr = data.split(",",3);
		for(int i=0;i<=arr.length-1;i++){
			System.out.println(arr[i]);
		}
	//	System.out.println(data);
		
//		data = data.replaceFirst("\\(", ",");
//		data = data.replaceFirst("\\)", ",");
//		if(!data.isEmpty()){
//			 bufferedwriter.write(data);
//			
//			 bufferedwriter.newLine();
//		}
		}
		scanner.close();
		
	//	 bufferedwriter.close();
		
	}

}
