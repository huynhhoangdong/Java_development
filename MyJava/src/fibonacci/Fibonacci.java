package fibonacci;

import java.util.Scanner;

public class Fibonacci {
	static int n1 = 0;
	static int n2 = 1;
	static int n3 = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the fibonacci numbers: ");
		int fiboNum = sc.nextInt();
		/// System.out.print(n1 + " " + n2);
		// fibonacci(fiboNum - 2);
		for (int i = 0; i < fiboNum; i++)
			System.out.print(" " + fibonacci_01(i));
		sc.close();
	}

	public static void fibonacci(int fiboNum) {

		if (fiboNum > 0) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.print(" " + n3);
			fibonacci(fiboNum - 1);
		}

	}

	public static int fibonacci_01(int fiboNum) {
		if (fiboNum == 0 || fiboNum == 1)
			return fiboNum;
		else
			return fibonacci_01(fiboNum - 1) + fibonacci_01(fiboNum - 2);
	}

}
