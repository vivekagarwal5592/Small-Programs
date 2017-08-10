package file_reading_writing;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class write {

	int accountid;
	String branch_name;
	String applicant_name;
	String account_type;
	int account_number;
	int Balance;
	String Email_id;
	int zipcode;
	private static final String FILE_HEADER = "id,firstName,lastName,gender,age";

	public write(int accntid, String branch_name, String applicant_name, String account_type, int account_number,
			int Balance, String Email_id, int zipcode) {

		this.accountid = accntid;
		this.branch_name = branch_name;
		this.applicant_name = applicant_name;
		this.account_number = account_number;
		this.Balance = Balance;
		this.Email_id = Email_id;
		this.zipcode = zipcode;
		this.account_type = account_type;

	}

	public void write_data() {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the file path");
		File file = new File(input.next());
		
		BufferedWriter writer;
		try {
			writer = new BufferedWriter(new FileWriter(file,true));
			
			writer.write(accountid + ",");
			writer.write(branch_name + ",");
			writer.write(applicant_name + ",");
			writer.write(account_number + ",");
			writer.write(Balance + ",");
			writer.write(Email_id + ",");
			writer.write(zipcode + ",");
			writer.write(account_type );
			writer.newLine();
			writer.close();

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("File not found");
		}
		// InputStreamReader i = new InputStreamReader();

	}

	// public String toString(){
	//
	// //return "ID" + id + "Interest" + interest + " Balance" + balance;
	// }

}
