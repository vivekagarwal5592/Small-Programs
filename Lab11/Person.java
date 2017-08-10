package Lab11;

import java.util.Comparator;

public abstract class Person implements Comparator<Person> {
	protected String firstName;
	protected java.util.Date birthdate;

	public Person(String firstName, java.util.Date birthdate) {
		this.firstName = firstName;
		this.birthdate = birthdate;
	}

	public java.util.Date getBirthdate() {
		return birthdate;
	}

	public String getName() {
		return firstName;
	}

	public String toString() {
		return getName() + " was born on " + birthdate;
	}

	public abstract Double getSalary();


}
