package quiza;

import static org.junit.Assert.*;

import org.junit.Test;

public class EnglishToMetricConverterTester {

	@Test
	public void testFreezingConversion() {
		EnglishToMetricConverter e = new EnglishToMetricConverter();
		final double freezingF = 32.0;
		final double freezingC = 0.0;
		assertEquals(e.convertTemperature(freezingF), freezingC, 0.0001);		
	}

	@Test
	public void testBoilingConversion() {
		EnglishToMetricConverter e = new EnglishToMetricConverter();
		final double boilingF = 212.0;
		final double boilingC = 100.0;
		assertEquals(e.convertTemperature(boilingF), boilingC, 0.0001);		
	}
	
	@Test
	public void testFreezing() {
		EnglishToMetricConverter e = new EnglishToMetricConverter();
		final double freezingF = -40;
		final double freezingC = -40;
		assertEquals(e.convertTemperature(freezingF), freezingC, 0.0001);	
		
		
	}
	
	@Test
	public void kilometer() {
		EnglishToMetricConverter e = new EnglishToMetricConverter();
		final double km = 3.2;
		final double miles = 2;
		assertEquals(e.convertDistance(miles), km, 0.0001);		
	}
	
	@Test
	public void kilometer2() {
		EnglishToMetricConverter e = new EnglishToMetricConverter();
		final double km = 1.6;
		final double miles = 1;
		assertEquals(e.convertDistance(miles), km, 0.0001);		
	}
	
	@Test
	public void kg() {
		EnglishToMetricConverter e = new EnglishToMetricConverter();
		final double pound= 2.2;
		final double kg = 1;
		assertEquals(e.convertWeight(pound), kg, 0.0001);		
	}
	
	@Test
	public void kg2() {
		EnglishToMetricConverter e = new EnglishToMetricConverter();
		final double pound= 4.4;
		final double kg = 2;
		assertEquals(e.convertWeight(pound), kg, 0.0001);		
	}
	
	/* add another test to verify that your converter shows the value -40 C for the input -40 F*/

	/* add at least two tests to verify that miles to KM conversion is correct.  Test several values, but one of them should 
	  test with the input value 1 mile. */
	
	/* add at least two tests to verify that pounds to KG conversion is correct.  test several values, but one of them should 	use the	input value 2.2 pounds. */
	



}
