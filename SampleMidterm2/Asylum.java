package SampleMidterm2;

public class Asylum extends Building{

	
	private String name;

	
	public Asylum(String name,boolean haunted,double size ){
		
		super(size,haunted);
		this.name = name;
//		this.size = size;
//		this.ishaunted = haunted;
	}
	
	@Override
	public void explore() {
		
		System.out.println("You pass a " +this.getSize()+"sq. meter house  called "  + this.name);
		
		if(isHaunted() == true){
			System.out.println("Watch out. A ghost");
		}
		
		
	}
}
