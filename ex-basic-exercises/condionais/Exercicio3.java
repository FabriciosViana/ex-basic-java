package condionais;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int A, B;
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		if (A > B) {
			if(A % B == 0) {
				System.out.println("S�O M�LTIPOS ");
			}else {
				System.out.println("N�O S�O M�LTIPLOS");
			}
		}else if(B > A){
			if(B % A == 0) {
				System.out.println("S�O M�LTIPLOS");
			}else {
				System.out.println("N�O S�O M�LTIPLOS");
			}
			
		}else {
			System.out.println("DEFAULT");
		}
		
		sc.close();
		
	}	
}
