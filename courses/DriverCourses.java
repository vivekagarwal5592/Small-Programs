package courses;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class DriverCourses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JButton add_student = new JButton("Add Student");
		JButton add_faculty = new JButton("Add Faculty");
		JButton view_students = new JButton("View Student List");
		JButton view_faculty = new JButton("View Faculty List");
		JButton view_courses = new JButton("View Courses");
		JButton add_courses_for_students = new JButton("Add courses for a student");
		JButton add_courses_for_faculty = new JButton("Add courses for a faculty");
		JButton remove_courses_for_students = new JButton("Remove courses for a student");
		JButton remove_courses_for_faculty = new JButton("Remove courses for a faculty");
		JButton remove_faculty = new JButton("Remove Faculty");
		JButton remove_student = new JButton("Remove Student");

		DriverCourses drivercourse = new DriverCourses();
		ArrayList<Student> student = new ArrayList<Student>();
		ArrayList<FacultyMember> faculty = new ArrayList<FacultyMember>();
		ArrayList<Course> course = new ArrayList<Course>();
		Person person = new Person();

		Address address = new Address("fernfield drive", 516, "Los Ageles", "California", "USA");

		course.add(new Course("101", "Java"));
		course.add(new Course("102", "Web programming"));
		course.add(new Course("103", "Android programming"));

		student.add(new Student("Vivek Agarwal", 305640912, address, course.get(0)));
		student.add(new Student("Tanushree Shenvi", 121, address, course.get(2)));
		faculty.add(new FacultyMember("Keyur Shah", 145, address, course.get(1)));
		faculty.add(new FacultyMember("Karan Desai", 134, address, course.get(0)));

		add_student.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					String student_name = JOptionPane.showInputDialog(null, "Enter the Student name");
					int student_cin = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the Student CIN"));
					int street_number = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the Street number"));
					String street_name = JOptionPane.showInputDialog(null, "Enter the Street name");
					String city_name = JOptionPane.showInputDialog(null, "Enter the City name");
					String state_name = JOptionPane.showInputDialog(null, "Enter the State name");
					String country_name = JOptionPane.showInputDialog(null, "Enter the Country name");

					Address address = new Address(street_name, street_number, city_name, state_name, country_name);
					student.add(new Student(student_name, student_cin, address));
					JOptionPane.showMessageDialog(null, "Student has been successfully added");
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please enter th correct details");
				}
			}
		});

		add_faculty.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					String faculty_name = JOptionPane.showInputDialog(null, "Enter the Faculty name");
					int employee_id = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the Faculty ID"));
					int street_number = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the Street number"));
					String street_name = JOptionPane.showInputDialog(null, "Enter the Street name");
					String city_name = JOptionPane.showInputDialog(null, "Enter the City name");
					String state_name = JOptionPane.showInputDialog(null, "Enter the State name");
					String country_name = JOptionPane.showInputDialog(null, "Enter the Country name");

					Address address = new Address(street_name, street_number, city_name, state_name, country_name);
					faculty.add(new FacultyMember(faculty_name, employee_id, address));
					JOptionPane.showMessageDialog(null, "Faculty has been successfully added");
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please enter th correct details");
				}

			}
		});

		view_courses.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				String list_of_courses = "";
				for (int i = 0; i <= course.size() - 1; i++) {
					list_of_courses += course.get(i);
				}
				JOptionPane.showMessageDialog(null, list_of_courses);
			}
		});

		view_students.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String list_of_students = "";
				for (int i = 0; i <= student.size() - 1; i++) {
					list_of_students += student.get(i);
				}
				JOptionPane.showMessageDialog(null, list_of_students);
			}
		});

		view_faculty.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String list_of_faculty = "";
				for (int i = 0; i <= faculty.size() - 1; i++) {
					list_of_faculty += faculty.get(i);
				}
				JOptionPane.showMessageDialog(null, list_of_faculty);
			}
		});

		add_courses_for_students.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Course course_details_temp;
				int i = drivercourse.search_student(student);

				if (i != -1) {
					course_details_temp = drivercourse.search_course(course);
					if (course_details_temp != null) {
						if (drivercourse.search_course_for_person(student.get(i), course_details_temp) == false) {
							student.get(i).setCourses(course_details_temp);
							JOptionPane.showMessageDialog(null, "Course " + course_details_temp.getCourse_title()
									+ " added for student " + student.get(i).getName());
						} else {
							JOptionPane.showMessageDialog(null, "Course already exist for student");
						}
					} else {
						JOptionPane.showMessageDialog(null, "Course does not exist in the list");
					}
				} else {
					JOptionPane.showMessageDialog(null, "Student does not exist");
				}

			}
		});

		add_courses_for_faculty.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				Course course_details_temp;
				int i = drivercourse.search_faculty(faculty);

				if (i != -1) {
					course_details_temp = drivercourse.search_course(course);
					if (course_details_temp != null) {
						if (drivercourse.search_course_for_person(student.get(i), course_details_temp) == false) {
							faculty.get(i).setCourses(course_details_temp);
							JOptionPane.showMessageDialog(null, "Course " + course_details_temp.getCourse_title()
									+ " added for Faculty " + student.get(i).getName());
						} else {
							JOptionPane.showMessageDialog(null, "Course already exist for the faculty");
						}
					} else {
						JOptionPane.showMessageDialog(null, "Course does not exist in the list");
					}
				} else {
					JOptionPane.showMessageDialog(null, "Student does not exist");
				}

			}
		});

		remove_courses_for_students.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				Course course_details_temp;
				int i;

				if ((i = drivercourse.search_student(student)) != -1) {
					if ((course_details_temp = drivercourse.search_course(course)) != null) {
						if (drivercourse.search_course_for_person(student.get(i), course_details_temp) == true) {
							student.get(i).removeCourses(course_details_temp);
							JOptionPane.showMessageDialog(null, "Course " + course_details_temp.getCourse_title()
									+ " removed for student " + student.get(i).getName());
						} else {
							JOptionPane.showMessageDialog(null, "Course does not exist for the student");
						}
					} else {
						JOptionPane.showMessageDialog(null, "Course does not exist in the list");
					}
				} else {
					JOptionPane.showMessageDialog(null, "Student does not exist");
				}

			}
		});

		remove_courses_for_faculty.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Course course_details_temp;
				int i = drivercourse.search_faculty(faculty);

				if (i != -1) {
					course_details_temp = drivercourse.search_course(course);
					if (course_details_temp != null) {
						if (drivercourse.search_course_for_person(faculty.get(i), course_details_temp) == true) {
							faculty.get(i).removeCourses(course_details_temp);
							JOptionPane.showMessageDialog(null, "Course " + course_details_temp.getCourse_title()
									+ " removed for faculty " + student.get(i).getName());
						} else {
							JOptionPane.showMessageDialog(null, "Course does not exist for faculty");
						}
					} else {
						JOptionPane.showMessageDialog(null, "Course does not exist");
					}
				} else {
					JOptionPane.showMessageDialog(null, "Faculty does not exist");
				}
			}
		});

		remove_student.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int i = drivercourse.search_student(student);
				if (i != -1) {
					student.remove(i);
					JOptionPane.showMessageDialog(null, "Student has been successfully removed");
				}
			}
		});

		remove_faculty.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int i = drivercourse.search_faculty(faculty);
				if (i != -1) {
					faculty.remove(i);
					JOptionPane.showMessageDialog(null, "Faculty has been successfully removed");
				}
			}
		});

		final JPanel panel = new JPanel();

		panel.add(add_student);
		panel.add(add_faculty);
		panel.add(view_students);
		panel.add(view_faculty);
		panel.add(view_courses);
		panel.add(add_courses_for_students);
		panel.add(add_courses_for_faculty);
		panel.add(remove_courses_for_students);
		panel.add(remove_courses_for_faculty);
		panel.add(remove_student);
		panel.add(remove_faculty);
		panel.setPreferredSize(new Dimension(250, 350));

		JOptionPane.showMessageDialog(null, panel);
	

	}

	public Course search_course(ArrayList<Course> course) {

		String list_of_courses = "";
		for (int i = 0; i <= course.size() - 1; i++) {
			list_of_courses += course.get(i);
		}

		String course_identifier = JOptionPane.showInputDialog(null, list_of_courses + "\nEnter Course Identifier");
		boolean course_flag = false;

		for (int i = 0; i <= course.size() - 1; i++) {
			if (course_identifier.equals(course.get(i).getCourse_identifier())) {
				return course.get(i);
			}
		}
		JOptionPane.showMessageDialog(null, "Course Identifier not found");
		return null;

	}

	public int search_student(ArrayList<Student> student) {

		String list_of_students = "";
		for (int i = 0; i <= student.size() - 1; i++) {
			list_of_students += student.get(i);
		}

		try {
			int cin = Integer.parseInt(JOptionPane.showInputDialog(null, list_of_students + "\nEnter Student CIN"));

			boolean flag = false;

			for (int i = 0; i <= student.size() - 1; i++) {
				if (cin == student.get(i).getCin()) {
					return i;
				}
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Please enter the correct details");
		}

		JOptionPane.showMessageDialog(null, "Student CIN not found");
		return -1;

	}

	public int search_faculty(ArrayList<FacultyMember> faculty) {

		String list_of_faculty = "";
		for (int i = 0; i <= faculty.size() - 1; i++) {
			list_of_faculty += faculty.get(i);
		}
		// JOptionPane.showMessageDialog(null, list_of_faculty);

		int cin = Integer.parseInt(JOptionPane.showInputDialog(null, list_of_faculty + "\nEnter Faculty Empolyee ID"));
		for (int i = 0; i <= faculty.size() - 1; i++) {
			if (cin == faculty.get(i).getEmployee_id()) {
				return i;
			}
		}

		return -1;

	}

	public boolean search_course_for_person(Person person, Course c) {

		boolean course_exist_for_person = false;
		for (int i = 0; i <= person.getCourses().size() - 1; i++) {
			if (c == person.getCourses().get(i)) {
				course_exist_for_person = true;
				break;
			}
		}

		return course_exist_for_person;

	}

}
