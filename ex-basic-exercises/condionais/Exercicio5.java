package condionais;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double cachorroQuente = 4.00;
		double xSalada = 4.50;
		double xBacon = 5.00;
		double torrada = 2.00;
		double refrigerante = 1.50;
		int escolha = sc.nextInt();
		int quantidade = sc.nextInt();
		
		
		if(escolha == 1) {
			double total = quantidade * cachorroQuente;
			System.out.printf("Você escolheu %d Cachorro-Quente(s), total a pagar: R$%.2f ", quantidade,total);
		}else if(escolha == 2) {
			double total = quantidade * xSalada;
			System.out.printf("Você escolheu %d X-Salada(s), total a pagar: R$%.2f ", quantidade,total);
		}else if(escolha == 3) {
			double total = quantidade * xBacon;
			System.out.printf("Você escolheu %d X-Bacon(s), total a pagar: R$%.2f ", quantidade,total);
		}else if(escolha == 4) {
			double total = quantidade * torrada;
			System.out.printf("Você escolheu %d Torrada Simples(s), total a pagar: R$%.2f ", quantidade,total);
		}else if(escolha == 5) {
			double total = quantidade * refrigerante;
			System.out.printf("Você escolheu %d Refrigerante(s), total a pagar: R$%.2f ", quantidade,total);
		}else {
			System.out.println("Você não fez nenhum pedido ");
		}
		
		sc.close();
		
		 

	}

}
