package ex04;

import java.util.Locale;
import java.util.Scanner;

public class AreaCircle {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio = sc.nextDouble();
		double pi = 3.14159;
		double area = Math.pow(raio, 2) * pi;
		
		System.out.printf("O valor da área do círculo é: %.4f ", area);
		
		sc.close();
		
		
		
		
		

	}

}
