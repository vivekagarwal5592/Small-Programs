package Midterm2_implementation;

public class Cats extends Animal {

	public Cats(String name, double weightInGrams) {
		super(name, weightInGrams);
		
	}

	@Override
	public void call() {
		 System.out.println("Meow");	
	}
	
	public String toString(){
		String s ="";
		
		 s = "Cat named " + this.getName() + " weighs " + this.getWeightInGrams() 
		+ " grams and says " + "Meow";
		 
		 
		
		return s;
	}

}
