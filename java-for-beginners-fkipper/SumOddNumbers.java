import java.util.Scanner;

public class SumOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = sc.nextInt();
        int evenNumbers = 0;
        sc.nextLine();
        for (int n=0; n<number; n++){
            if (n%2 == 0) {
                evenNumbers += n;
                System.out.println(n+" was sum");
            }
        }
        System.out.println(evenNumbers + " sum of even numbers.");


        sc.close();

    }
}
