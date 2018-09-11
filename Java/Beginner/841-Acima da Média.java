import java.util.Scanner;

public class programa {

	private static Scanner in;

	public static void main(String[] args) {
		
		// Link do exercicio: https://www.thehuxley.com/problem/841?locale=pt_BR

		in = new Scanner(System.in);
		
		double r1 = in.nextDouble();
		double r2 = in.nextDouble();
		double r3 = in.nextDouble();
		int cont=0;
		double r = (r1+r2+r3)/3;
		
		if (r < r1)
			cont++;
		if (r < r3)
			cont++;
		if (r < r2)
			cont++;
		
		System.out.printf("%d\n",cont);
	}

}
