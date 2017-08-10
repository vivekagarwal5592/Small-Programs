package Quiz7;

import java.util.ArrayList;
import java.util.Random;

public class CourseRoll {

	ArrayList<Student> student = new ArrayList<Student>();
	private int nextCin;
	Simulator simulator = new Simulator();
	
	

	public void offerClass() {
		for (int i = 0; i < 30; i++) {
			student.add(new Student(i + 1, simulator.getgaussianData()));
		}

	}

	

}
