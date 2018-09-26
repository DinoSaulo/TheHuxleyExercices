
import java.util.Scanner;

public class AnosBissextos {

	public static void main(String[] args) {

		//Link do Exercicio: https://www.thehuxley.com/problem/297?locale=pt_BR
		
		Scanner in = new Scanner(System.in);
		
		int aux = 0; //Vari?vel auxiliar
		int i = 0; //Contador
		
		int anoIn = in.nextInt(); // Ano Inicial
		int anoFim = in.nextInt(); //Ano Final
				
		for(i=anoIn; i<=anoFim; i++){
			if(0 == i % 400 || (0 == i % 4  && 0 != i % 100)){
				System.out.println(i);
				aux ++;
			}
		}
		
		if (aux == 0){
			System.out.println("-1");
		}
	}
}