package estruturasRepeticoes;

import java.util.Locale;
import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char resp;
		
		do {
			System.out.print("Digite a temperatura em Celsius: ");
			double c = sc.nextDouble();
			double f = ((9*c)/5) + 32;
			System.out.println("Equivalente em Fahrenheit: " + f);
			System.out.print("Deseja repetir (s/n)?");
			resp = sc.next().charAt(0);
			
		}while(resp != 'n');
		
		sc.close();
		
	}

}
