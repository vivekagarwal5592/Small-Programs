package Lab8;

import static org.junit.Assert.*;

import org.junit.Test;

public class testcase_myset {

	@Test
	public void text_instance_variables_length() {
		int set1arr[] = { 2, 3, 4, 6 };
		MySet set1 = new MySet(set1arr);
		assertEquals(4, set1.getArr().length);
	}

	@Test
	public void text_instance_variables() {
		int set1arr[] = { 2, 3, 4, 6 };
		MySet set1 = new MySet(set1arr);
		int[] x = set1.getArr();
		for (int i = 0; i < set1.getArr().length; i++) {
			assertEquals("mismatch at " + i, set1arr[i], x[i]);
		}
	}

	@Test
	public void test_addition() {

		int set1arr[] = { 2, 3, 4, 6 };
		int set2arr[] = { 5, 6, 7 };
		//
		MySet set1 = new MySet(set1arr);
		MySet set2 = new MySet(set2arr);
		MySet set3 = set1.add(set2);

		int[] expectedResult = new int[] { 2, 3, 4, 5, 6, 7 };
		int[] actaulResult = set3.getArr();

		

		// http://stackoverflow.com/questions/4228161/comparing-arrays-in-junit-assertions-concise-built-in-way
		for (int i = 0; i < expectedResult.length; i++) {
			assertEquals("mismatch at " + i, expectedResult[i], actaulResult[i]);
		}

	}
	
	@Test
	public void test_addition_length() {

		int set1arr[] = { 2, 3, 4, 6 };
		int set2arr[] = { 5, 6, 7 };
		//
		MySet set1 = new MySet(set1arr);
		MySet set2 = new MySet(set2arr);
		MySet set3 = set1.add(set2);

		int[] expectedResult = new int[] { 2, 3, 4, 5, 6, 7 };
		int[] actaulResult = set3.getArr();

		assertEquals(expectedResult.length, actaulResult.length);

	}
	
	@Test
	public void test_subtraction_length() {

		int set1arr[] = { 2, 3, 4, 6 };
		int set2arr[] = { 5, 6, 7 };
		//
		MySet set1 = new MySet(set1arr);
		MySet set2 = new MySet(set2arr);
		MySet set3 = set1.subtract(set2);

		int[] expectedResult = new int[] { 5, 7 };
		int[] actaulResult = set3.getArr();

		assertEquals(expectedResult.length, actaulResult.length);

		

	}

	@Test
	public void test_subtraction() {

		int set1arr[] = { 2, 3, 4, 6 };
		int set2arr[] = { 5, 6, 7 };
		//
		MySet set1 = new MySet(set1arr);
		MySet set2 = new MySet(set2arr);
		MySet set3 = set1.subtract(set2);

		int[] expectedResult = new int[] { 5, 7 };
		int[] actaulResult = set3.getArr();

		assertEquals(expectedResult.length, actaulResult.length);

		// http://stackoverflow.com/questions/4228161/comparing-arrays-in-junit-assertions-concise-built-in-way
		for (int i = 0; i < expectedResult.length; i++) {
			assertEquals("mismatch at " + i, expectedResult[i], actaulResult[i]);
		}

	}

	@Test
	public void test_multiplication_length() {

		int set1arr[] = { 2, 3, 4, 6 };
		int set2arr[] = { 7, 5, 6 };

		MySet set1 = new MySet(set1arr);
		MySet set2 = new MySet(set2arr);
		MySet set3 = set1.multiply(set2);

		int[] expectedResult = new int[] { 2, 3, 4, 5, 7 };
		int[] actaulResult = set3.getArr();

		assertEquals(expectedResult.length, actaulResult.length);

		// http://stackoverflow.com/questions/4228161/comparing-arrays-in-junit-assertions-concise-built-in-way
		for (int i = 0; i < expectedResult.length; i++) {
			assertEquals("mismatch at " + i, expectedResult[i], actaulResult[i]);
		}

	}
	
	
	@Test
	public void test_multiplication() {

		int set1arr[] = { 2, 3, 4, 6 };
		int set2arr[] = { 7, 5, 6 };

		MySet set1 = new MySet(set1arr);
		MySet set2 = new MySet(set2arr);
		MySet set3 = set1.multiply(set2);

		int[] expectedResult = new int[] { 2, 3, 4, 5, 7 };
		int[] actaulResult = set3.getArr();

		assertEquals(expectedResult.length, actaulResult.length);

		// http://stackoverflow.com/questions/4228161/comparing-arrays-in-junit-assertions-concise-built-in-way
		for (int i = 0; i < expectedResult.length; i++) {
			assertEquals("mismatch at " + i, expectedResult[i], actaulResult[i]);
		}

	}

	@Test
	public void test_division() {

		int set1arr[] = { 2, 3, 4, 6 };
		int set2arr[] = { 5, 6, 7 };

		MySet set1 = new MySet(set1arr);
		MySet set2 = new MySet(set2arr);
		MySet set3 = set1.divide(set2);

		int[] expectedResult = new int[] { 6 };
		int[] actaulResult = set3.getArr();

		assertEquals(expectedResult.length, actaulResult.length);
		// http://stackoverflow.com/questions/4228161/comparing-arrays-in-junit-assertions-concise-built-in-way
		for (int i = 0; i < expectedResult.length; i++) {
			assertEquals("mismatch at " + i, expectedResult[i], actaulResult[i]);
		}

	}

}
