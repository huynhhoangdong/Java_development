package list_prime;

import java.util.Scanner;

public class ListPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int col = 0;
		int runNum = 0;

		Scanner sc = new Scanner(System.in);

		System.out.print("Please enter numbers of primes: ");
		int nPrime = sc.nextInt();
		System.out.print("Please enter numbers of rows  : ");
		int nRow = sc.nextInt();

		int nCol = nPrime / nRow;
		System.out.println("The number of columns is: " + nCol);

		sc.close();

		// Loop until enough nPrime prime numbers
		while (nPrime != 0) {
			if (isPrime(runNum)) {
				if (col <= (nCol - 2)) {
					// Print out primes in 1 line
					System.out.print(runNum + "\t");
					col++;
				} else {
					// Enter a new line to print out primes
					System.out.println(runNum + "\t");
					col = 0;
				}
				nPrime--;
			}
			runNum++;
		}
	}

	/*
	 * @Method: indicate the number is prime or not
	 * 
	 * @Date: 24/July/2018
	 * 
	 * @Variable: nPrime is the number to check
	 * 
	 * @Output: return true if it is a prime and vice versa
	 */
	public static boolean isPrime(int nPrime) {
		// 0 and 1 are not prime
		if (nPrime == 0 || nPrime == 1)
			return false;
		// Check it is a prime or not
		for (int i = 2; i <= (int) Math.sqrt(nPrime); i++) {
			if (nPrime % i == 0)
				return false;
		}
		// ------------------------
		return true;
	}
}
