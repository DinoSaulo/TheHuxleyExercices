import java.util.Scanner;

public class divisores {

    //link do exrcicio = https://www.thehuxley.com/problem/164?locale=pt_BR

	private static Scanner in;

	public static void main(String[] args) {

	in = new Scanner(System.in);
	int total=0;
	
	int	n = in.nextInt();
	
	for(int i =0; i<n;i++)
	{
		int	parte = in.nextInt();
		total+=parte-1;
	}
	
		System.out.println(total);

		
	}
}

		
		