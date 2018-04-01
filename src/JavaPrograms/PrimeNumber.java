package javaPrograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		PrimeNumber pn = new PrimeNumber();
		Scanner reader = new Scanner(System.in); // Reading from System.in
		System.out.println("Enter a number: ");
		int n = reader.nextInt(); // Scans the next token of the input as an int.
		// once finished
		reader.close();
		System.out.println(pn.prime(n));
	}

	// function to print true if a number is prime or else false
	public boolean prime(int n) {
		boolean result = true;
		for (int i = 2; i < n / 2 + 1; i++) {
			if (n % i == 0) {
				return false;
			} else {
				result = true;
			}
		}
		return result;
	}
}
