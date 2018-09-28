import java.text.NumberFormat;
import java.util.Scanner;

public class divisores {

	private static Scanner in;

	public static void main(String[] args) {
		
		// Link do exercicio: https://www.thehuxley.com/problem/292?locale=pt_BR
		
		in = new Scanner(System.in);
				
		double a = in.nextDouble();
		double b = in.nextDouble();
		double c = in.nextDouble();
		double pi =3.14159;
		
		
		System.out.printf("TRIANGULO: %.3f\n",(a*c)/2);
		System.out.printf("CIRCULO: %.3f\n",pi*c*c);
		System.out.printf("TRAPEZIO: %.3f\n",(a+b)*c/2);
		System.out.printf("QUADRADO: %.3f\n",b*b);
		System.out.printf("RETANGULO: %.3f\n",a*b);
		
		
	}	
	
}

		
		