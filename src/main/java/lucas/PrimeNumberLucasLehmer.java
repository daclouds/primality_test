package lucas;

import number.PrimeNumber;

// https://en.wikipedia.org/wiki/Lucas%E2%80%93Lehmer_primality_test
public class PrimeNumberLucasLehmer implements PrimeNumber {

	@Override
	public boolean isPrime(int n) {
		double s = 4;
		double m = Math.pow(2, n) - 1;
		for (int i = 0; i < n - 2; i++) {
			s = ((s*s)-2) % m;
		}
		if (s == 0) return true;
		else return false;
	}
	
}
