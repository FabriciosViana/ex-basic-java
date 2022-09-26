package ex04;

import java.util.Locale;
import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double comprimento, largura, preco, area, precoFinal;
		
		comprimento = sc.nextDouble();
		largura = sc.nextDouble();
		preco = sc.nextDouble();
		
		System.out.println("Dados digitados: ");
		System.out.println("Comprimento: " + comprimento);
		System.out.println("Largura: " + largura);
		System.out.printf("Preço: " + preco + " %n%n");
		
		area = comprimento * largura;
		precoFinal = preco * area;
		
		System.out.println("Dados digitados: ");
		System.out.println("Área do imóvel: " + area);
		Locale.setDefault(Locale.US);
		System.out.printf("Preço total do imóvel R$%.2f", precoFinal);
		
		sc.close();
		

	}

}
