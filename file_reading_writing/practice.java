package file_reading_writing;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class practice {

	
	public void read_file(){
		
		Scanner scanner = new Scanner(System.in);
		String file_name = scanner.next();
		
	File file = new File(file_name);
	try{
	Scanner file_reader = new Scanner(file);
	
	while(file_reader.hasNextLine()){
		
		System.out.println(file_reader.nextLine());
	}
	}
	catch(Exception e){
		
	}
	}
	
	public void write_file(){
		
		int a[] = new int[10];
		
		for(int i=0;i<=a.length-1;i++){
			a[i] = 1;
		}
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the file name");
		String file_name = scanner.next();
		
		File file = new File(file_name);
		
		try {
			BufferedWriter br = new BufferedWriter(new FileWriter(file));
			
			for(int i=0;i<=a.length-1;i++){
				br.write(a[i] + ",");
			}
			br.close();
			
			System.out.println("done");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
}
