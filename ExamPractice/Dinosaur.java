package ExamPractice;

public class Dinosaur extends Monster {

	String name;
	
	
	public Dinosaur(String name) {
		
		this.name = name;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

//	@Override
	public void setName(String name) {
		
		this.name = name;
		
	}
	
	

}
