package courses;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class FacultyMember extends Person {

	private int employee_id;
	private Address address = new Address();
	private Course teaching_schedule = new Course();

	public FacultyMember() {
		this.add_faculty_details();
	}

	public FacultyMember(String name, int employee_id, Address address, Course c) {
		this.setName(name);
		this.setEmployee_id(employee_id);
		this.setAddress(address);
		this.teaching_schedule = c;
		this.setCourses(teaching_schedule);
	}
	
	public FacultyMember(String name, int employee_id, Address address) {
		this.setName(name);
		this.setEmployee_id(employee_id);
		this.setAddress(address);
		this.setCourses(teaching_schedule);
	}

	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public void add_faculty_details() {

		try {
			this.setName(JOptionPane.showInputDialog(null, "Enter the Faculty name"));
			this.employee_id = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the Employee ID"));
			address.setStreet_number(Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the Street number")));
			address.setStreet_name(JOptionPane.showInputDialog(null, "Enter the Street name"));
			address.setCity(JOptionPane.showInputDialog(null, "Enter the City name"));
			address.setState(JOptionPane.showInputDialog(null, "Enter the State name"));
			address.setCountry(JOptionPane.showInputDialog(null, "Enter the Country name"));
			this.setAddress(address);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Please enter the correct details");
		}
	}

	public String toString() {
		String faculty = "";
		faculty = "Faculty Name: " + this.getName() + " Employee ID: " + this.getEmployee_id() + " \nAddress: "
				+ this.getAddress() + "\nTeaching Schedule: ";

		Course c;
		for (int i = 0; i <= this.getCourses().size() - 1; i++) {
			c = this.getCourses().get(i);

			faculty += c;

		}
		faculty += "\n";

		return faculty;
	}

}
