package Lab11;

import java.util.Date;

public class Faculty extends Person {

	double monthlySalary;
	String status;
	
	public Faculty(String firstName, Date birthdate, double monthlySalary) {
		super(firstName, birthdate);
		this.monthlySalary = monthlySalary;
	}

	@Override
	public Double getSalary() {
		return this.monthlySalary*9;
	}

	public double getMonthlySalary() {
		return monthlySalary;
	}

	public String getStatus() {
		return status;
	}
	
	public String toString(){
		
		String val ="";
		val = this.getName() +"  was born on"+ this.getBirthdate()+". Status: " + this.getStatus();
		return val;	
	}

	@Override
	public int compare(Person arg0, Person arg1) {
		// TODO Auto-generated method stub
		return 0;
	}

}
