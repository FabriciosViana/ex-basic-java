package condionais;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double valor = sc.nextDouble();
		
		if(valor >= 0 && valor <= 25) {
			System.out.printf("%.2f Está no intervalo de [0,25] ", valor);
		}else if(valor > 25 && valor <= 50 ) {
			System.out.printf("%.2f Está no intervalo de [25,50] ", valor);
		}else if(valor > 50 && valor <= 75 ) {
			System.out.printf("%.2f Está no intervalo de [50,75] ", valor);
		}else if(valor > 75 && valor <= 100) {
			System.out.printf("%.2f Está no intervalo de [75,100] ", valor);
		}else {
			System.out.printf("%.2f Está fora do intervalo ", valor);
		}
		
		sc.close();
	}

}
