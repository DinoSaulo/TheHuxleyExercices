package zcffbxsdffh;

import java.util.Scanner;

public class teste {

	private static Scanner in;

	public static void main(String[] args) {

		// Link do exercicio: https://www.thehuxley.com/problem/288?locale=pt_BR
		
		in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int d = in.nextInt();
		int e = in.nextInt();
		
		if((a==1 || b==1)&&(c==1)&&(d==1)&&e==1)
				System.out.println("AVALIADO");
		else
			System.out.println("0");
	}

}
