package Quiz7;

import java.util.Random;

public class Simulator {

	private double gpa;
	Random r = new Random();
	public static final double MEAN = 3;
	public static final double SDV = 1;
	
	public double getgaussianData() {

		gpa = r.nextGaussian() * SDV + MEAN;
		
		//r.next
		
		while(gpa <2 || gpa>4){
			gpa = r.nextGaussian() * SDV + MEAN;
		}
		
	//	r.next
		return gpa;
	}
	
}
