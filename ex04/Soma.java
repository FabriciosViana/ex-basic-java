package ex04;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int soma = num1 + num2;
		
		System.out.printf("A soma entre %d e %d é: %d ", num1, num2, soma);
	}

}
