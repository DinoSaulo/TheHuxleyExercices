import java.util.Scanner;

public class programa1 {

	private static Scanner in;

	public static void main(String[] args) {
		

		in = new Scanner(System.in);
		double Y, Z,u=0,v=0,pi = 3.1416;
		double r = in.nextDouble();
		
		double area= 4*pi * r*r;
		double volume = (4*pi * r*r*r)/3;
		
		System.out.printf("%.2f\n%.2f\n",area,volume);
	}

}
