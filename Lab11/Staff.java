package Lab11;

import java.util.Date;

public class Staff extends Person {

	private double annualSalary;
	private int experience;

	public Staff(String firstName, Date birthdate, double annualSalary, int experience) {
		super(firstName, birthdate);
		this.annualSalary = annualSalary;
		this.experience = experience;
	}

	@Override
	public Double getSalary() {

		Double salary;

		salary = annualSalary + (annualSalary * (30.0 - experience) / 60.0);

		return salary;

	}

	public double getAnnualSalary() {
		return annualSalary;
	}

	public int getExperience() {
		return experience;
	}

	public String toString() {

		String val = "";

		val = this.getName() + "  was born on" + this.getBirthdate() + ". Experience: " + this.getExperience();

		return val;

	}

	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
