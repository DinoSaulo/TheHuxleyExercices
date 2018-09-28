package programas;

import java.util.Scanner;

public class SBV {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		double raioCM = in.nextDouble();
		
		double raioM = raioCM /100;
		
		double area = 3.14159 * raioM * raioM;
		
		System.out.printf("Area = %.4f",  area);
		
	}
}
