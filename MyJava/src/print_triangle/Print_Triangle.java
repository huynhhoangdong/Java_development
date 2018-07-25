package print_triangle;

import java.util.Scanner;

public class Print_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int row = 1;
		int space = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the high: ");
		int high = sc.nextInt();
		space = high - row;
		sc.close();

		for (int i = 0; i < high; i++) {

			for (int k = 0; k < space; k++) {
				System.out.print(" ");
			}

			for (int j = 0; j < row; j++) {

				System.out.print(" *");
			}

			++row;
			space = high - row;
			System.out.println("");

		}

	}

}
