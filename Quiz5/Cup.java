package Quiz5;

public class Cup extends Vessel {

	private int radius;
	private static double pi = 3.14;

	public Cup(int radius) {
		super();
		this.radius = radius;
		this.volume = getVolumeInML();
	}

	@Override
	public double getVolumeInML() {
		// TODO Auto-generated method stub
	
		double v = (0.5 * pi * Math.pow(radius, 3) * 4) / 3;
		
		if(v < 0 ){
			System.out.println( "invalid volume received");
			this.volume = 0;
			 return volume;
		}

		this.volume = v;

		return volume;
		
		

	}

}
