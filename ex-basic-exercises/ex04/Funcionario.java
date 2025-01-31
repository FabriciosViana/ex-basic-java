package ex04;

import java.util.Locale;
import java.util.Scanner;

public class Funcionario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int  number = sc.nextInt();
		double horasTrabalhadas = sc.nextDouble();
		double valorHora = sc.nextDouble();
		double salario = valorHora * horasTrabalhadas;
		
		System.out.printf("%d recebe %.2f", number,salario);
		
		sc.close();
		
		

	}

}
