package quiza;

public class EnglishToMetricConverter implements ScaleConverter {

	@Override
	public double convertTemperature(double tempInfarhenite) {
		
		double temperature_in_Celsius  = (tempInfarhenite - 32) * 5/9;
		return temperature_in_Celsius;
	}

	@Override
	public double convertDistance(double distanceIn) {
		double distance_in_KM  = 1.6 * distanceIn;
		return distance_in_KM;
	}

	@Override
	public double convertWeight(double weightInpound) {
		double weight_in_KG =  weightInpound/2.2;
		return weight_in_KG ;
	}

}
