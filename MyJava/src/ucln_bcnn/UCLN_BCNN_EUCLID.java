package ucln_bcnn;

import java.util.Scanner;

public class UCLN_BCNN_EUCLID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("TINH UCLN VA BCNN CUA 2 SO");

		System.out.print("Nhap so hang thu 1: ");
		int a = sc.nextInt();
		System.out.print("Nhap so hang thu 2: ");
		int b = sc.nextInt();

		System.out.println("UCLN cua hai so " + a + " va " + b + " la: " + UCLN_BCNN.ucln(a, b));
		System.out.println("BCNN cua hai so " + a + " va " + b + " la: " + UCLN_BCNN.bcnn(a, b));

		sc.close();

	}

	/*
	 * Find UCLN of a and b
	 * 
	 * @param a:
	 * 
	 * @param b:
	 * 
	 * @return : UCLN of a and b
	 * 
	 */
	public static int ucln(int a, int b) {
		if (b == 0)
			return a;
		return ucln(b, a % b);
	}

	public static int bcnn(int a, int b) {
		return (a * b) / ucln(a, b);
	}

}
