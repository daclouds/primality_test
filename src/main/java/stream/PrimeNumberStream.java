package stream;

import java.util.stream.Stream;

import number.PrimeNumber;

public class PrimeNumberStream implements PrimeNumber {

	@Override
	public boolean isPrime(int n) {
		if (n <= 1) return false;
		return Stream.iterate(2, i -> i + 1).limit((long) Math.sqrt(n)).noneMatch(i -> n % i == 0);
	}
	
}
