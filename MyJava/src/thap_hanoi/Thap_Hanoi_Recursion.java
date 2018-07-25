package thap_hanoi;

import java.util.Scanner;

public class Thap_Hanoi_Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the number of dishes: ");
		int nDish = sc.nextInt();
		thapHanoiRecursion(nDish, 'A', 'C', 'B');

		sc.close();

	}

	public static void thapHanoiRecursion(int n, char source, char destination, char intermediate) {

		if (n == 1) {

			System.out.format("Move 1 dish: %s --> %s", source, destination);

		} else {

			thapHanoiRecursion(n - 1, source, intermediate, destination);

			System.out.println(String.format("Move 1 dish: %s --> %s", source, destination));

			thapHanoiRecursion(n - 1, intermediate, destination, source);

		}

	}

}
