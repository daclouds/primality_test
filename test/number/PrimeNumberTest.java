package number;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import simple.PrimeNumberSimple;
import sqrt.PrimeNumberSquareRoot;
import stream.PrimeNumberStream;
import wilson.PrimeNumberWilson;

public class PrimeNumberTest {

	PrimeNumber numbers;
	
	@Before
	public void setUp() {
//		numbers = new PrimeNumberSimple();
		numbers = new PrimeNumberStream();
		numbers = new PrimeNumberSquareRoot();
//		numbers = new PrimeNumberWilson();
	}
	
	@Test
	public void testSimple() throws Exception {
		assertTrue(numbers.isPrime(5));
	}

	@Test
	public void testBig() throws Exception {
		assertTrue(numbers.isPrime(Integer.MAX_VALUE));
	}
	
	@Test
	public void testIsNotAPrime() throws Exception {
		assertFalse(numbers.isPrime(Integer.MAX_VALUE-1));
	}
	
	@Test
	public void testNegative() throws Exception {
		assertFalse(numbers.isPrime(-1));
	}

}
