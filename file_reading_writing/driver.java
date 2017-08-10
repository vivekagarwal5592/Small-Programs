package file_reading_writing;

public class driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int account_id = 1234 ;
		String branch_name =  "Wells Fargo" ;
		String applicant_name = "Vivek Agarwal" ;
		String account_type = "Savings";
		int account_number = 1234567890;
		int Balance = 1000;
		String Email_id = "vivekagarwal5592@gmail.com";
		int zipcode = 123466;
		
		
		write w= new write(account_id ,branch_name,applicant_name,account_type, account_number, Balance,
				Email_id,zipcode);
		
		w.write_data();
	
//		System.out.println("Enter the account id ");
//		System.out.println("Enter the branch_name ");
//		System.out.println("Enter the applicant_name  ");
//		System.out.println("Enter the account_type");
//		System.out.println("Enter the account_number");
//		System.out.println("Enter the Balance ");
//		System.out.println("Enter the  Email_id");
//		System.out.println("Enter the zipcode ");
		
		read r = new read();
		
		r.read_from_file();
	}

}
