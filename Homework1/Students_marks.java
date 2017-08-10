package Homework1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Students_marks {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner s = new Scanner(System.in);
		String filename = s.next();
		File file = new File(filename);

		Scanner read_file = new Scanner(file);

		String data = "";

		while(read_file.hasNext()){
		data += read_file.next();
		}

		String score_of_students[] = data.split(" ");

		int best =0;
		for(int i=1;i<=Integer.valueOf(score_of_students[0])-1;i++){
		if(Integer.valueOf(score_of_students[i])>best){
		best = Integer.valueOf(score_of_students[i]);
		}
		}
		for(int i=1;i<=Integer.valueOf(score_of_students[0])-1;i++){
		if(Integer.valueOf(score_of_students[i])>= best-15){

		System.out.println("Student" + i + "score is " + score_of_students[i] + "and grade is A");
		}
		}

	}

}
