package Quiz5;

public abstract class Vessel {

	public abstract double getVolumeInML();
	public double volume;
	public double amountPouredIn;
	public double amountSpilled;
	
	public void consume(double amountConsumed){
		
		if(amountConsumed > amountPouredIn ){
			System.out.println("You can consume only "	 + amountPouredIn  +
					"since that is amount currently stored in the vessel");
			System.out.println("You consume " + amountPouredIn + "of your favourite beverages" );
			amountPouredIn = 0;
		}
		
		else{
		System.out.println("You consume " + amountConsumed + "of your favourite beverages" );
		amountPouredIn = amountPouredIn - amountConsumed;
		}
	}
	
	public double getAmountSpilled(double amountPouredIn) {
		
		this.amountSpilled =  amountPouredIn -volume ;
		
		if(this.amountSpilled > 0){
			return this.amountSpilled;
		}
		
		else return 0;
			
	}
	
	public void pourIn(double amountPouredIn) {
		
		this.amountPouredIn = amountPouredIn -getAmountSpilled(amountPouredIn);
		
		if(getAmountSpilled(amountPouredIn) >0){	
			
			System.out.println( this.amountPouredIn + " is the amount poured in vessel");	
				System.out.println(getAmountSpilled(amountPouredIn) + "spilled");
		}
		
		else{
			System.out.println( this.amountPouredIn   + " is the amount poured in vessel");
		}
		
		
	}

	public double getAmountPouredIn() {
		return amountPouredIn;
	}

	
	
	
	
	
	
}
