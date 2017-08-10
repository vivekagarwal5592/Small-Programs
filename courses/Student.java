package courses;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Student extends Person {

	private int cin;
	private ArrayList<Course> courses = new ArrayList<Course>();
	Address address = new Address();
	
	

	public Student() {
	
	}
	
	public Student(String name, int cin, Address address, Course c){
		
		this.setName(name);
		this.setCin(cin);
		this.setAddress(address);
		this.setCourses(c);
		
	}
	
public Student(String name, int cin, Address address){
		
		this.setName(name);
		this.setCin(cin);
		this.setAddress(address);
		
		
	}
	
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getCin() {
		return cin;
	}

	public void setCin(int cin) {
		this.cin = cin;
	}


	

	

	public String toString() {

		
		
		String Student = "";
		Student = "Student Name: " + this.getName() + " CIN: " + this.getCin() + " \nAddress: " + this.getAddress()
		+ " \nCourses taken:" ;
		
		Course c;
		for(int i=0;i<=this.getCourses().size()-1;i++){
		c=	this.getCourses().get(i);
		
		Student += c;
		
		}
		 Student += "\n";
		
		return Student;
	}

}
