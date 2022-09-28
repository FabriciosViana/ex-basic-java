package estruturasRepeticoes;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//for(inicio;condição;incremento){ comando}
		int N = sc.nextInt();
		int soma = 0;
		for(int i=0; i<N; i++) {
			int x = sc.nextInt();
			soma += x;
		}
		
		System.out.println(soma);
		sc.close();
		
		
		
	}

}
