package Homework1;

import java.util.Scanner;

public class BankAccountTester {

	public static void main(String[] args) {
		Bank_account acc1 = new Bank_account();
		boolean done = false;

		while (done == false) {
			System.out.println("What do you want to do \n");
			System.out.println("1.Create a new Account");
			System.out.println("2.Withdraw from the account");
			System.out.println("3.Deposit from the Account");
			System.out.println("4.Get Account information");
			System.out.println("5.Exit");

			Scanner input = new Scanner(System.in);
			int choice = input.nextInt();
			switch (choice) {

			case 1:
				System.out.println("Enter your ID");
				int new_id = input.nextInt();
				System.out.println("Enter your balance");
				int bal = input.nextInt();
				System.out.println("Enter your interest");
				int interest = input.nextInt();
				acc1.setBalance(bal);
				acc1.setId(new_id);
				acc1.setInterest(interest);
				break;

			case 2:
				System.out.println("Enter the amount to be withdrawn");
				double amt = input.nextDouble();
				acc1.setBalance(acc1.getBalance() - amt);
				break;

			case 3:
				System.out.println("Enter the amount to be deposited");
				amt = input.nextDouble();
				acc1.setBalance(acc1.getBalance() + amt);
				break;

			case 4:
				System.out.println("Your id is " + acc1.getId());
				System.out.println("Your interest is " + acc1.getInterest());
				System.out.println("Your balance is " + acc1.getBalance());
			//	System.out.println(acc1);
				break;

			case 5:
				System.exit(0);
			}

		}

	}

}
