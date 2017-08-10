package PriorityQueues;

public class StudentDetails implements Comparable<StudentDetails> {

	String name;
	int CIN;
	
	public StudentDetails(String name, int CIN){
		this.name = name;
		this.CIN = CIN;
	}
	
	@Override
	public int compareTo(StudentDetails student) {
		
	//	System.out.println(this.CIN + " "+student.CIN);
		if(this.CIN > student.CIN){
			return 1;
		}
		
		else if(this.CIN < student.CIN){
			return -1;
		}
		
		else return 0;
	}
	
	public String toString(){
		
		String x = this.name + " " + this.CIN;
		
		return x;
		
	}
	
	
	
	
}
