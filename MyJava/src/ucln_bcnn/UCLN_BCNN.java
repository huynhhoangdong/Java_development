package ucln_bcnn;

import java.util.Scanner;

public class UCLN_BCNN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("TINH UCLN VA BCNN CUA 2 SO");
			
		System.out.print("Nhap so hang thu 1: ");
		int a = sc.nextInt();
		System.out.print("Nhap so hang thu 2: ");
		int b = sc.nextInt();
		
		System.out.println("UCLN cua hai so " + a + " va " + b + " la: " + UCLN_BCNN.ucln(a,b));
		System.out.println("BCNN cua hai so " + a + " va " + b + " la: " + UCLN_BCNN.bcnn(a,b));
		
		sc.close();
		
	}
	
	//UCLN cho a va b
	public static Object ucln (int a, int b) {
		if(a==0 && b==0) {
			System.out.println("We do not have UCLN for both 0");
			return null;
		} else if (a==0 || b==0) {
			return a+b;
		} else {
			while(a!=b) {
				if (a>b) a=a-b;
				else     b=b-a;
			}
			return a;
		}
	}
	
	//BCNN cho a va b
	public static int bcnn (int a, int b ) {
		if(a==0 && b==0) {
			return 0;
		} else {	
			int c = (a*b)/ (int) ucln(a,b);
			return c;
		}
	}
}
