package ex03;

import java.util.Scanner;

public class Entrada {
	// LENDO TEXTO AT� A QUEBRA DE LINHA

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		String s1, s2, s3;
		x = sc.nextInt();
		sc.nextLine();
		s1 = sc.nextLine(); //NEXT  LINE L� A LINHA INTEIRA
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("Dados Digitados: ");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		
		
		sc.close();
	}

}
