package estruturasRepeticoes;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int senha;
		int inicio = 1;
		
		while(inicio == 1) {
			senha = sc.nextInt();
			if(senha == 2002) {
				System.out.println("Acesso Permitido !");
				break;
			}else {
				System.out.println("Senha Inválida ");
				
			}
		}
		
		sc.close();

	}

}
