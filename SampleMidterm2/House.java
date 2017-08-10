package SampleMidterm2;

public class House extends Building{

	
	private String feature ;


	public House(String feature, boolean haunted, double size) {
		super(size,haunted);
		this.feature = feature;
//		this.ishaunted = haunted;
//		this.size = size;
	}


	@Override
	public void explore() {
		
		System.out.println("You pass a " +this.getSize()+"sq. meter house with a(n)"  + this.feature);
		
		if(isHaunted() == true){
			System.out.println("Watch out. A ghost");
		}
		
	}
	
}
