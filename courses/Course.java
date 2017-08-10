package courses;

import javax.swing.JOptionPane;

public class Course {

	private String course_identifier;
	private String course_title;
	
	public Course(){
	}
	
	
	public Course(String course_identifier,String course_title ){
		this.course_identifier = course_identifier;
		this.course_title = course_title;
	}

	public String getCourse_identifier() {
		return course_identifier;
	}

	public void setCourse_identifier(String course_identifier) {
		this.course_identifier = course_identifier;
	}

	public String getCourse_title() {
		return course_title;
	}

	public void setCourse_title(String course_title) {
		this.course_title = course_title;
	}
	
	public String toString(){
		
		String list = "course_identifier: " + this.course_identifier + " course_title: " 
		+ this.course_title  + "\n";
		
		return list;
	}
	
	
	

}
