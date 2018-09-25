package programas;

import java.util.Scanner;

public class TesteCalculadora {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		// Link do Exercicio: https://www.thehuxley.com/problem/568?locale=pt_BR
		
			int ano = in.nextInt();
			if(0 == ano % 400 || (0 == ano % 4  && 0 != ano % 100)){
				System.out.println("BISSEXTO");
			}
			else
				System.out.println("NAOBISSEXTO");
		
		}
}
