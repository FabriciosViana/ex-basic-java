package estruturasRepeticoes;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int alcool, gasolina, diesel, fim, inicio, escolha;
		inicio = 1;
		alcool = 0;
		gasolina = 0;
		diesel = 0;
		fim = 0;
		
		while(inicio>0) {
;
			escolha = sc.nextInt();
			if(escolha == 1) {
				alcool += 1;
			
			}else if(escolha == 2) {
				gasolina += 1;
				
				
			}else if(escolha == 3) {
				diesel += 1;
				;
				
			}else if(escolha == 4) {
				System.out.println("Fim do programa");
				break;
			}else {
				System.out.println("MUITO OBRIGADO");
			}
			//System.out.println("Alcool: " + alcool);
			//System.out.println("Diesel: " + diesel);
			//System.out.println("Gasolina: " + gasolina);
		}
		System.out.println("Alcool: " + alcool);
		System.out.println("Diesel: " + diesel);
		System.out.println("Gasolina: " + gasolina);
		sc.close();
		

	}

}
