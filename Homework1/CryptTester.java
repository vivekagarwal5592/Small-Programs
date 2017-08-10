package Homework1;

import static org.junit.Assert.*;

import org.junit.Test;

public class CryptTester {

	@Test
	public void test() {
		String location = "Transylvania";
		Crypt c = new Crypt(location);
		assertNotNull(c);
	}
	
	@Test
	public void testToString(){
		String location = "Transylvania";
		Crypt c = new Crypt(location);
		assertNull(c.toString());
	}
}