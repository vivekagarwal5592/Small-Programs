package Quiz7;

import java.util.ArrayList;

public class driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CourseRoll courseroll = new CourseRoll();
		courseroll.offerClass();
		
		for(int i=0;i<= courseroll.student.size()-1;i++){
		System.out.println(	 courseroll.student.get(i));
		}
		
		
		
	}

}
