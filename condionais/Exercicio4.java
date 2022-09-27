package condionais;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int initialHour = sc.nextInt();
		int lastHour = sc.nextInt();
		int duration = initialHour - lastHour;
		
		
		if(initialHour >= 1 && lastHour <= 24) {
			if(duration < 0) {
				int durationNew = duration * -1;
				System.out.printf("O jogo durou %d HORA(S) ",durationNew );
			}else {
				System.out.printf("O jogo durou %d HORA(S) ",duration );
			}
			
		}else {
			System.out.println("O jogo ultrapassou o limite máximo de 24 horas ou não atingiu o limite mínimo de 1 Hora !");
		}
		
		sc.close();
			
	}

}
