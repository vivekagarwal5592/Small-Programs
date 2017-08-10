package Homework1;

public class Vampire implements Monster, Cloneable {

	private String name;
	private Crypt crypt;

	public Vampire(String name, String location) {
		this.name = name;
		crypt = new Crypt(location);
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}	
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setLocation(String location) {
		crypt.setLocation(location);// TODO Auto-generated method stub
	}
	
	@Override
	public String getLocation(){
		return crypt.getLocation();		
	}

	@Override
	public void rampage() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getOriginStory() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}