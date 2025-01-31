import java.util.Random;
import java.util.Scanner;

public class PasswordValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int password;
        int validPassword = rnd.nextInt(2000);

        do {
            System.out.println("Enter your password: ");
            password = sc.nextInt();
        }while(validPassword != password);


        sc.close();
    }
}
