
public class PrimeNumber {

	public static void main(String[] args) {
		PrimeNumber pn = new PrimeNumber();
		System.out.println(pn.prime(2));
		

	}

	public boolean prime(int n) {
		boolean result = true;
		for (int i = 2; i < n / 2; i++) {
			if (n % i == 0) {
				return false;
			} else {
				result = true;
			}
		}

		return result;

	}

}
