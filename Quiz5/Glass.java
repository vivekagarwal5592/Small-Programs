package Quiz5;

public class Glass extends Vessel {

	
	private int radius;
	private int height;
	private static double pi = 3.14;
	
	
	
	public Glass(int radius, int height) {
		super();
		this.radius = radius;
		this.height = height;
	}



	@Override
	public double getVolumeInML() {
		
		
		double v = ( pi * Math.pow(radius, 2) * height);
		
		if(v < 0 ){
			System.out.println( "invalid volume received");
			this.volume = 0;
			 return volume;
		}

		this.volume = v;

		return volume;
		
	}
}
