package dec_to_hex;

import java.util.Scanner;

public class DecToHex {

	public static void main(String[] args) {
		int[] hex = new int[10];
		int hexValue = 0;
		int i = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please input a dec number: ");
		int dec = sc.nextInt();
		
		sc.close();
		
		do {
			hexValue = dec%16;
			hex[i] =  hexValue;
			dec = dec/16;
			if (dec == 0) break;
			++i;
		} while (dec != 0);
		
		System.out.println("Gia tri i: " + i);
		for (int j = i; j>=0 ;j--) {
			System.out.printf("%X",hex[j]);
		}
	}
}
