package programa;

import java.util.Scanner;

public class program {

    //link = https://www.thehuxley.com/problem/85?locale=pt_BR

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int vezes = in.nextInt();

		boolean flag = false, flag2 = false;
		int proxNum, numeroSeparado, contNumPosiCerta = 0, contNumCerto = 0, c = 0;
		int proxNum1, numeroSeparado1;

		int c0 = 0, c1 = 0, c2 = 0, c3 = 0, c4 = 0, c5 = 0, c6 = 0, c7 = 0, c8 = 0, c9 = 0;

		for (int i = 0; i < vezes; i++) {
			int quantCaracteresSenha = in.nextInt();
			int[] caracteresSenha = new int[quantCaracteresSenha];
			char[] caracteresDaTentativa = new char[quantCaracteresSenha];
			int[] bons = new int[quantCaracteresSenha];
			boolean[] arrayExelentes = new boolean[quantCaracteresSenha];

			int senha = in.nextInt();
			proxNum = senha;

			for (int j = quantCaracteresSenha - 1; j >= 0; j--) {
				numeroSeparado = proxNum % 10;
				proxNum = proxNum / 10;
				caracteresSenha[j] = numeroSeparado;
				
				// iniciando todas as posicoes do array com false
				
			}

			int tentativa = in.nextInt();// recebendo a tentativa
			proxNum1 = tentativa;

			while (tentativa != 0) {
				for (int j = quantCaracteresSenha - 1; j >= 0; j--) {
					numeroSeparado1 = proxNum1 % 10;
					proxNum1 = proxNum1 / 10;
					caracteresDaTentativa[j] = (char)numeroSeparado1;
					
					arrayExelentes[j] = false;

				}

				for (int a = 0; a < quantCaracteresSenha; a++) {
					if (caracteresDaTentativa[a] == caracteresSenha[a]) {
						contNumPosiCerta++;
						//caracteresDaTentativa[a] = 'a';
						arrayExelentes[a] = true;
					} else {
						for (int b = 0; b < quantCaracteresSenha; b++) {
							if (arrayExelentes[b] == false) {
								if (caracteresSenha[a] == caracteresDaTentativa[b]) {
									bons[a] = caracteresDaTentativa[b];

									contNumCerto++;
									arrayExelentes[b] = true;
									if(a==0&&b==(quantCaracteresSenha-1)&&caracteresSenha[0] == caracteresSenha[1]) contNumCerto--;
									b = quantCaracteresSenha;

								}
							}
						}

					}

				}

				System.out.println("(" + contNumPosiCerta + "," + (contNumCerto ) + ")");

				if (contNumPosiCerta == quantCaracteresSenha) {
					tentativa = 0;
				} else // se nao continua novamente
				{
					tentativa = in.nextInt();
					proxNum1 = tentativa;
				}

				// zera os contadores
				contNumPosiCerta = 0;
				contNumCerto = 0;

			}

		}
	
	}

}


