package condionais;

import java.util.Locale;
import java.util.Scanner;

public class Cartesiano {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		if(x == 0.0 && y ==0.0) {
			System.out.println("ORiGEM");	 
		}else if(x > 0 && y > 0) {
			System.out.println("Q1 - Primeiro quadrante");
		}else if(x < 0 && y > 0) {
			System.out.println("Q2 - Segundo quadrante");
		}else if(x < 0 && y < 0) {
			System.out.println("Q3 - Terceiro quadrante");
		}else if(x > 0 && y < 0) {
			System.out.println("Q4 - Quarto quadrante");
		}else {
			System.out.println("DEFAULT");
		}
		
		sc.close();
	}

}
