package PrimeNumber;

import static org.junit.Assert.*;

import org.junit.Test;

public class PNTest {
	PrimeNumber test = new PrimeNumber();
	
	@Test
	public void test() {
		assertEquals(true,test.isPrime(17));
		
	}
	

}
