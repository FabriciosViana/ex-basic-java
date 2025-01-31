package ex04;

import java.util.Locale;
import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		double pi = 3.14159;
		
		double areaTriangulo = (A * C) /2;
		double areaCirculo = Math.pow(C, 2) * pi;
		double areaTrapezio = ((A + B) * C)/2;
		double areaQuadrado = Math.pow(B, 2);
		double areaRetangulo = B * A;
		
		System.out.println("TRIANGULO: " + areaTriangulo);
		System.out.println("CIRCULO: " + areaCirculo);
		System.out.println("TRAPÉZIO: " + areaTrapezio);
		System.out.println("QUADRADO: " + areaQuadrado);
		System.out.println("RETÂNGULO: " + areaRetangulo);
		
		sc.close();
		
		
		

	}

}
