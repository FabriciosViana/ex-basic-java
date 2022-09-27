package ex04;

import java.util.Locale;
import java.util.Scanner;

public class Pecas {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// int codigoPeca1 = sc.nextInt();
		int numPecas1 = sc.nextInt();
		double valorPeca1 = sc.nextDouble();
		double subTotal1 = numPecas1 * valorPeca1;
		
		// int codigoPeca2 = sc.nextInt();
		int numPecas2 = sc.nextInt();
		double valorPeca2 = sc.nextDouble();
		double subTotal2 = numPecas2 * valorPeca2;
		
		double total = subTotal1 + subTotal2;
		
		
		System.out.println("Valor a pagar: R$" + total);
		
		sc.close();
	}
}
