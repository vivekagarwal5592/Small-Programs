package Midterm2_implementation;

public class Mice extends Animal {

	public Mice(String name, double weightInGrams) {
		super(name, weightInGrams);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void call() {
		
		System.out.println("Eeks");
		
	}

	
	public String toString(){
		String s ="";
		
		 s = "Mouse name " + this.getName() + " weighs " + this.getWeightInGrams() 
		+ " grams and says " + "Eeks";
		
		return s;
	}
	
	
	
}
