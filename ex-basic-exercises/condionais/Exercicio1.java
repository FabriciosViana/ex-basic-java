package condionais;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		
		if(number > 0) {
			System.out.printf("%d é positivo ", number);
			
		}else if(number == 0) {
			System.out.printf("%d é igual a 0 ", number);
		}else {
			System.out.printf("%dn é negativo ", number);
		}
		
		//EXERCICIO 2 - verificando se o número é par ou ímpar
		
		if(number % 2 == 0) {
			System.out.println("PAR");
		}else {
			System.out.println("ÍMPAR");
		}
		
		sc.close();
	}

}
