package ex03;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//String x;
		//int y;
		//double z;
		//char c;
		
		// input de string
		//x = sc.next();
		//System.out.println("Você digitou o valor: " + x);
		
		//input de inteiro
		//y = sc.nextInt();
		//System.out.println("Você digitou o número: " + y);
		
		//input de float/double
		//z = sc.nextDouble();
		//System.out.println("Você digitou o número decimal: " + z);
		
		//input de char(caracter)
		//c = sc.next().charAt(0);  //funcao charAt(0) pega o primeiro caracter de uma string
		//System.out.println("Você digitou: " + c);
		
		//Input de vários dados na mesma linha
		String x;
		int y;
		double z;
		
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		
		System.out.println("Dados digitados: ");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
