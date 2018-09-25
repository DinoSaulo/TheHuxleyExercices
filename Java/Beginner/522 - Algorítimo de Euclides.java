package programa;

import java.util.Scanner;

public class  HuxleyCode {
    
    // Link do Exercicio: https://www.thehuxley.com/problem/552?locale=pt_BR
    
	public static int MDC(int x, int y) {
		if (x%y == 0){
			return y;
			}else{
			return MDC(y,x % y);
			}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int vezes = in.nextInt();

		for (int i = 0; i < vezes; i++) {
			int num1 = in.nextInt();
			int num2 = in.nextInt();

			System.out.printf("MDC(%d,%d) = %d\n", num1, num2, MDC(num1, num2));
		}
	}

}
