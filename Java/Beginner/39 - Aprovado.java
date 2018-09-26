package programas;

import java.util.Scanner;

public class SBV {

	public static void main(String[] args) {

		// Link do Exercicio: https://www.thehuxley.com/problem/39?locale=pt_BR

		Scanner in = new Scanner(System.in);
		
		double nota1 = in.nextDouble();
		double nota2 = in.nextDouble();
		double nota3 = in.nextDouble();
		
		double media = (nota1 + nota2 + nota3)/3;
		
		if (media >= 7)
			System.out.println("aprovado");
		
		else if( 3 <= media && media < 7)
			System.out.println("prova final");
			
		else if (media < 3)
			System.out.println("reprovado");
		
	}
}
