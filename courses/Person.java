package courses;

import java.util.ArrayList;

public class Person {

	private String name;
	private Address address = new Address();
	ArrayList<Course> courses = new ArrayList<Course>();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public ArrayList<Course> getCourses() {
		return courses;
	}
	
	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}
	public void setCourses(Course courses) {
		this.courses.add(courses);
	}
	
	public void removeCourses(Course courses){
		this.courses.remove(courses);
	//	this.courses.remove(0);
	}
	public String toString() {
		String faculty = "";
		faculty = "Person Name: " + this.getName() +  " \nAddress: "
				+ this.getAddress()  ;
		
		
	
		 faculty += "\n";
		
		return faculty;
	}
	
}
