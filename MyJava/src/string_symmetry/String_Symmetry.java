package string_symmetry;

import java.util.Scanner;

public class String_Symmetry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter a String: ");
		String str = sc.nextLine();

		sc.close();

		if (isSymmetry(str))
			System.out.println("It is a symmertry string");
		else
			System.out.println("It is NOT a symmertry string");
	}

	public static boolean isSymmetry(String str) {
		int strLenght = str.length();
		if (strLenght == 0 || strLenght == 1) {
			return true;
		} else {
			for (int i = 0; i < strLenght / 2; i++) {
				if (str.charAt(i) != str.charAt(strLenght - 1 - i)) {
					return false;
				}
			}
			return true;
		}
	}
}
