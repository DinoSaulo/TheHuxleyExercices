import java.util.Scanner;

public class divisores {

	private static Scanner in;

	public static void main(String[] args) { 

		//Link do Exercicio: https://www.thehuxley.com/problem/935?locale=pt_BR

		in = new Scanner(System.in);
		
		System.out.printf("Informe a primeira nota:\n");
		double b1 = in.nextDouble();
		System.out.printf("Informe a segunda nota:\n");
		double b2 = in.nextDouble();
		System.out.printf("Informe a terceira nota:\n");
		double b3 = in.nextDouble();
		
		double med = (b1+b2+b3)/3;
		
		if(med>=7)
			System.out.printf("Aprovado com media %.1f\n",med);
		else if(med>=5)
			System.out.printf("Recuperacao com media %.15f\n",med);
		else
			System.out.printf("Reprovado com media %.1f\n",med);
	

		
	}
}

		
		