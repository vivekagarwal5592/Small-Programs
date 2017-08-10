package file_reading_writing;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.Scanner;

public class read {

	public void read_from_file() {

		System.out.println("Enter the file path");
		Scanner input = new Scanner(System.in);
		String data[];
		try {

			File f = new File(input.next());
			Scanner freader = new Scanner(f);

			if(freader.hasNextLine()){
				if(freader.nextLine() == ""){
					freader.nextLine();
				};
				//	System.out.println();
			}
			
			String line = null;
			while (freader.hasNextLine()) {
				// line = freader.nextLine();
				line = freader.nextLine();
			
				data = line.split(",");

				// for(int i=0;i<=2;i++){
				// System.out.println(data[i]);
				// }
				 System.out.println(data[0] + " " +data[1] + " " + data[2] + " " + data[3] +
				" " + data[4] + " " + data[5] +  " " + data[6] + " "
				 + data[7]);
			//	System.out.println(line);

			}

			freader.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
