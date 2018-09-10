import java.text.NumberFormat;
import java.util.Scanner;

public class divisores {

    // link do exercicio : https://www.thehuxley.com/problem/691?locale=pt_BR

	private static Scanner in;

	public static void main(String[] args) {
		
		
		in = new Scanner(System.in);
				
		int a = in.nextInt();
		int b = in.nextInt();
		
		if (a>b){
			System.out.print(b+" ");
			System.out.println(a);
		}
		else{
			System.out.print(a+" ");
			System.out.println(b);
		}
	}	
	
}

		
		