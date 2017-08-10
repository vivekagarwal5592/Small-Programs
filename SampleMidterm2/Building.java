package SampleMidterm2;

public abstract class Building {

	private double size;
	private boolean haunted;
	
	
	
	public Building(double size, boolean ishaunted) {
		super();
		this.size = size;
		this.haunted = ishaunted;
	}

	public abstract void explore();
	
	
	
	
	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public void setHaunted(boolean haunted) {
		this.haunted = haunted;
	}

	public boolean isHaunted() {
		return haunted;
	}
	
	
}
