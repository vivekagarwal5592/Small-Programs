package Lab10;

public class Cowboy extends Character{

	static int number;
	
	
	
	public Cowboy(double accuracy) {
		super();
		
		this.accuracy = accuracy;
		 this.name = "Cowboy # " + String.valueOf(Integer.valueOf(number+1));
		 
		 number +=1;
		
	}



	@Override
	public void shoot(Character c) {
		
		// TODO Auto-generated method stub
	
				System.out.println(this.getName()+ " attempts to shoot " + c.getName()+
						" in the back like a coward");
				
				
				double shot = this.r.nextDouble();
				
				if(shot <= this.getAccuracy()){
					c.receiveInjury(shot);
				}
				
				else{
					System.out.println("Shot Missed!");	
				}
		
	}

}
