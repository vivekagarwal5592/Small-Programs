package quiza;

public class MetricToEnglishConverter implements ScaleConverter {

	@Override
	public double convertTemperature(double tempInfarcelcius) {
		
		double temperature_in_farhenite  = (tempInfarcelcius  *9/5) +32;
		return temperature_in_farhenite;
		
	}

	@Override
	public double convertDistance(double distanceInkm) {
		double distance_in_miles  =  distanceInkm/1.609;
		return distance_in_miles;
	}

	@Override
	public double convertWeight(double weightInkg) {
		double weight_in_pound =  weightInkg*2.2;
		return weight_in_pound ;
	}

}
