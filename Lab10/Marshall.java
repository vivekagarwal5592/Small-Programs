package Lab10;

public class Marshall extends Character{

	
	

	public Marshall(String name, double Accuracy) {
		super();
		
		this.name = name;
		this.accuracy = Accuracy;
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public void shoot(Character c) {
		// TODO Auto-generated method stub
		System.out.println(this.getName()+ " steadfastly stands up to " + c.getName()+
				" and draws!");
		
		
		double shot = this.r.nextDouble();
		
		if(shot <= this.getAccuracy()){
			c.receiveInjury(shot);
		}
		
		else{
			System.out.println("Shot Missed!");	
		}
		
		
	}

}
