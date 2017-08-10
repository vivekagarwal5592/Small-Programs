package Homework1;

public class Bank_account {


	int id = 0;
	double balance =0;
	double interest = 0;
	
	
	public Bank_account(){
		
	}
	
public Bank_account(int newID, double newBalance, double newInterest){
		
	}
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public double getInterest() {
		return interest;
	}


	public void setInterest(double interest) {
		this.interest = interest;
	}
	
	public String toString(){
		
		return "ID" + id + "Interest" + interest + " Balance" + balance;
	}


	
	
	

	

}
