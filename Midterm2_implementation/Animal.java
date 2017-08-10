package Midterm2_implementation;

public abstract class Animal {

	private String name;
	private double weightInGrams;
	
	public Animal(String name, double weightInGrams) {
		super();
		this.name = name;
		this.weightInGrams = weightInGrams;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeightInGrams() {
		return weightInGrams;
	}

	public void setWeightInGrams(double weightInGrams) {
		this.weightInGrams = weightInGrams;
	}
	
	public void eat(double foodWeight){
		this.weightInGrams += foodWeight;
	}
	
	public abstract void call();
	
	
	
}
