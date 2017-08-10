package Dictionary;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class FileProcessing {

	String word;
	String type;
	String defination;
	String line;
	static ArrayList<FileProcessing> file_processing;

	public FileProcessing(String word, String type, String defination) {
		this.word = word;
		this.defination = defination;
		this.type = type;

	}

	public FileProcessing() {

	}

	public static void main(String[] args) {

		file_processing = new ArrayList<FileProcessing>();
		 array_list_processing(file_processing);
//	single_word();
	//	obj.process_x(file_processing);
//		array_list_processing(file_processing);
		processing();
		
	}

	public static void process_x(ArrayList<FileProcessing> fp) {

		File file = new File("C:\\Users\\user\\Desktop\\word_defination2.csv");
		// File file2 = new
		// File("C:\\Users\\user\\Desktop\\word_defination2.csv");

		try {
			// System.out.println("I am here");
			Scanner scanner = new Scanner(file);

			scanner.useDelimiter(",");
			// fp.add(new FileProcessing("", "", ""));

			// int j=0;
			while (scanner.hasNextLine()) {
				fp.add(new FileProcessing(scanner.next().toLowerCase().trim(), scanner.next().toLowerCase().trim(),
						scanner.nextLine().toLowerCase().trim()));
			}

			for (int i = 0; i <= fp.size() - 1; i++) {
				fp.get(i).defination = fp.get(i).defination.replace("%, ", "%");
				fp.get(i).defination = fp.get(i).defination.replace(", ", ",");
				fp.get(i).defination = fp.get(i).defination.replaceAll(",", " ");
				fp.get(i).defination = fp.get(i).defination.trim();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void single_word() {

		// File file = new File("C:\\Users\\user\\Desktop\\a.csv");
		File file2 = new File("C:\\Users\\user\\Desktop\\dictionary_word.txt");

		try {
			// Scanner scanner = new Scanner(file);
			BufferedWriter bufferedwriter = new BufferedWriter(new FileWriter(file2));
			// scanner.useDelimiter(",");
			// String temp_word = "";
			// String temp_def = "";
			for (int i = 1; i <= file_processing.size() - 1; i++) {
				bufferedwriter.write(file_processing.get(i).word.trim().toLowerCase());

				bufferedwriter.newLine();
				// temp_word = scanner.next();
				// type = scanner.next();
				// temp_def += scanner.nextLine();
				// line = word + "," + type + temp_def;

				// if (word.equals(temp_word)) {
				// defination += temp_def;
				// // line += defination;
				// } else {
				// line = temp_word + "," + temp_def + defination;
				// bufferedwriter.write(line);
				// defination = "";
				// temp_def = "";
				// System.out.println(line);
				// temp_word = word;
				// bufferedwriter.newLine();
				//
				// }
			}
			bufferedwriter.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block

		}

	}

	public static void processing() {

		// File file = new File("C:\\Users\\user\\Desktop\\a.csv");
		File file2 = new File("C:\\Users\\user\\Desktop\\word_defination4.csv");

		try {
			// Scanner scanner = new Scanner(file);
			BufferedWriter bufferedwriter = new BufferedWriter(new FileWriter(file2));
			// scanner.useDelimiter(",");
			// String temp_word = "";
			// String temp_def = "";
			for (int i = 1; i <= file_processing.size() - 1; i++) {
				
				file_processing.get(i).type = file_processing.get(i).type.replaceAll(",imPronoun & Pronoun Pronoun", ",pronoun");
				file_processing.get(i).type = file_processing.get(i).type.replaceAll(",Pronoun Pronoun. & vb. Noun", ",pronoun|Noun|Verb");
				file_processing.get(i).type = file_processing.get(i).type.replaceAll(",Pronoun Pronoun", ",pronoun");
				file_processing.get(i).type = file_processing.get(i).type.replaceAll(",AdjectiVerb & AdjectiVerbVerb", ",adjective|Verb");
				file_processing.get(i).type = file_processing.get(i).type.replaceAll("t.", "");
				file_processing.get(i).type = file_processing.get(i).type.replaceAll("i.","");
				file_processing.get(i).type = file_processing.get(i).type.replaceAll("&"," ");
				file_processing.get(i).type = file_processing.get(i).type.replaceAll("adjecve","adjective");
				System.out.println(file_processing.get(i).type);
				bufferedwriter.write(file_processing.get(i).word.toLowerCase().trim());
				bufferedwriter.write(file_processing.get(i).type.toLowerCase().trim());
				bufferedwriter.write(file_processing.get(i).defination.toLowerCase().trim());
		//		System.out.println(file_processing.get(i).defination);
				bufferedwriter.newLine();
				// temp_word = scanner.next();
				// type = scanner.next();
				// temp_def += scanner.nextLine();
				// line = word + "," + type + temp_def;

				// if (word.equals(temp_word)) {
				// defination += temp_def;
				// // line += defination;
				// } else {
				// line = temp_word + "," + temp_def + defination;
				// bufferedwriter.write(line);
				// defination = "";
				// temp_def = "";
				// System.out.println(line);
				// temp_word = word;
				// bufferedwriter.newLine();
				//
				// }
			}
			bufferedwriter.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void array_list_processing(ArrayList<FileProcessing> fp) {

		File file = new File("C:\\Users\\user\\Desktop\\word_defination4.csv");
		// File file2 = new
		// File("C:\\Users\\user\\Desktop\\word_defination2.csv");

		try {
			// System.out.println("I am here");
			Scanner scanner = new Scanner(file);

			scanner.useDelimiter(",");
			fp.add(new FileProcessing("", "", ""));
			String temp_word = "";
			String temp_def = "";
			String temp_type = "";
			int j = 0;
			while (scanner.hasNextLine()) {
				//System.out.println(j);
				temp_word = scanner.next();
				temp_type = scanner.next();
				temp_def = scanner.nextLine();
				

//				if (temp_type.contains("n.")) {
//					temp_type = temp_type.replaceAll("n.", "Noun");
//				}
//
//				if (temp_type.contains("a.")) {
//					temp_type = temp_type.replaceAll("a.", "Adjective");
//				}
//
//				if (temp_type.contains("v.")) {
//					temp_type = temp_type.replaceAll("v.", "Verb");
//				}
//
//				if (temp_type.contains("pl.")) {
//					temp_type = temp_type.replaceAll("pl.", "Plural");
//				}
//
//				if (temp_type.contains("p.")) {
//					temp_type = temp_type.replaceAll("p.", "Pronoun");
//				}
//
//				if (temp_type.contains("pr.")) {
//					temp_type = temp_type.replaceAll("pr.", "Proverb");
//				}
				
				boolean flag = true;
				for(int i=fp.size() - 10;i<=fp.size() - 1&&i>=0;i++){
					if (fp.get(i).word.equals(temp_word)) {
						flag = false;
						break;
						// System.out.println("I am here");
						// fp.get(fp.size() - 1).defination += temp_def + "%";
					}
				}

				 if(flag==true) {
					fp.add(new FileProcessing(temp_word, "," + temp_type, temp_def));
				}
				j++;
			}
			scanner.close();

			// for (int i = 1; i <= fp.size() - 1; i++) {
			//
			// fp.get(i).defination = fp.get(i).defination.replaceAll("%, ",
			// "%");
			//
			// }

			for (int i = 1; i <= fp.size() - 1; i++) {
//				System.out.print(fp.get(i).word);
//				System.out.print(fp.get(i).type);
//				System.out.println(fp.get(i).defination);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
