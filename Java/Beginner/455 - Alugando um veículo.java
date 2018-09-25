import java.text.NumberFormat;
import java.util.Scanner;

public class NotaseMoedas {

	public static void main(String[] args) {
	    
	    // Link do Exercicio : https://www.thehuxley.com/problem/445?locale=pt_BR
		
		Scanner in = new Scanner(System.in);
		
		int	dias = in.nextInt();
		double	km = in.nextDouble();
		double kilometr=0;
		
		if (km>100*dias){
			kilometr = ((km-(100*dias))*12);
		}
		
		double fim = dias*90+kilometr;

		if(dias ==0)
			System.out.printf("%.2f\n",km*12);
		else System.out.printf("%.2f\n",fim);
	}

}
