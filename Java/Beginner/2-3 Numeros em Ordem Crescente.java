import java.util.Scanner;

public class Projeto1 {

	public static void main(String[] args) {
		/*
		 Projeto 1 -  Organizador de 3 n?meros crescentes
		 Aluno: Saulo Alexandre
		 Data: 08/03/17
		 */
		 
		int x=0,y=0,z=0;
		//vari?veis auxiliares
		
		Scanner sc1 = new Scanner(System.in);
		int a = sc1.nextInt();
		int b = sc1.nextInt();
		int c = sc1.nextInt();
		
		if (a>b){	
			if (b>c){ // a>b>c
				x = a;
				y = b;
				z = c;
			} else { 
				if (a>c){ //a>c>b
					x = a;
					y = c;
					z = b;
				} else { //c>a>b
					x = c;
					y = a;
					z = b;
				}
			}
		}
		
		else if (b>c){	
				if (a>c){ //b>a>c
					x = b;
					y = a;
					z = c;
				} else { // b>c>a
					x = b;
					y = c;
					z = a;
				}
		}
		else { //a=b=c
			x = c;
			y = b;
			z = a;
		}
		//imprimindo valores na tela
		System.out.println(z);
		System.out.println(y);
		System.out.println(x);
	}
}
