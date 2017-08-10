package Lab8;

import static org.junit.Assert.*;

import org.junit.Test;

public class testcase{

	
	
	
	@Test
	public void test_object_for_null() {
		
		MyFraction c = new MyFraction(1,2,'+');	
		assertNotNull(c.getNumerator());
		assertNotNull(c.getDenominator());
		assertNotNull(c.getSign());
	}
	
	@Test
	public void test_check_numerator_value() {
		
		MyFraction c = new MyFraction(1,2,'+');
		
		assertEquals(1,c.getNumerator());
		
	}
	
	@Test
	public void test_check_denominator_value() {
		
		MyFraction c = new MyFraction(1,2,'+');
		
		assertEquals(2,c.getDenominator());
		
	}
	
	@Test
	public void test_check_sign_value() {
		MyFraction c = new MyFraction(1,2,'+');	
		assertEquals('+',c.getSign());	
	}
	
	
	
	@Test
	public void test_additon_result() {	
		MyFraction num1 = new MyFraction(1,2,'+');
		MyFraction num2 = new MyFraction(1,2,'+');
		MyFraction num3 = num1.add(num2);
		assertEquals(1,num3.getNumerator());
		assertEquals(1,num3.getDenominator());
		assertEquals('+',num3.getSign());
	}
	
	@Test
	public void test_subtraction_result() {
		MyFraction num1 = new MyFraction(1,4,'+');
		MyFraction num2 = new MyFraction(1,2,'+');
		MyFraction num3 = num2.subtract(num1);
		assertEquals(-1,num3.getNumerator());
		assertEquals(4,num3.getDenominator());
		assertEquals('-',num3.getSign());
			
	}
	
	@Test
	public void test_multiplication_result() {
		MyFraction num1 = new MyFraction(1,4,'+');
		MyFraction num2 = new MyFraction(1,2,'+');
		MyFraction num3 = num1.multiply(num2);
		assertEquals(1,num3.getNumerator());
		assertEquals(8,num3.getDenominator());
		assertEquals('+',num3.getSign());
		
	}
	
	@Test
	public void test_division_result() {
		MyFraction num1 = new MyFraction(1,4,'+');
		MyFraction num2 = new MyFraction(1,2,'+');
		MyFraction num3 = num2.divide(num1);
		assertEquals(1,num3.getNumerator());
		assertEquals(2,num3.getDenominator());
		assertEquals('+',num3.getSign());
	}
	
	
	
	}


