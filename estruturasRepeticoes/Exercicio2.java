package estruturasRepeticoes;

import java.util.Locale;
import java.util.Scanner;


public class Exercicio2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x, y;
		int inicio = 1;
		
		while(inicio > 0) {
			x = sc.nextDouble();
			y = sc.nextDouble();
			
			if(x > 0 && y >0) {
				System.out.println("Q1");
			}else if(x < 0 && y > 0) {
				System.out.println("Q2");
			
			}else if(x < 0 && y < 0 ) {
				System.out.println("Q3");
				
			}else if(x > 0 && y < 0) {
				System.out.println("Q4");
			}else {
				break;
			}
		}
		
		sc.close();
		

	}

}
