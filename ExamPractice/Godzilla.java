package ExamPractice;

public class Godzilla extends Monster {

	private String name;
	
	
	
	public Godzilla(String name) {
		super();
		this.name = name;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	
	public void setName(String name){
		
		this.name = name;
	}

	
}
