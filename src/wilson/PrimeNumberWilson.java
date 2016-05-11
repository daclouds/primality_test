package wilson;

import number.PrimeNumber;

// https://en.wikipedia.org/wiki/Wilson%27s_theorem
public class PrimeNumberWilson implements PrimeNumber {

	@Override
	public boolean isPrime(int n) {
		if (n <= 1)
			return false;
		else if (n <= 3)
			return true;
		else if (n % 2 == 0 || n % 3 == 0)
			return false;
		int i = 5;
		while (i * i <= n) {
			if (n % i == 0 || n % (i + 2) == 0)
				return false;
			i = i + 6;
		}
		return true;
	}

}
