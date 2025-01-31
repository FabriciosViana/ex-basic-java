import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Random numberGenerator = new Random();
        int misteriousNumber = numberGenerator.nextInt(100);
        int attempt;
        do {
            System.out.println("Guess the number: ");
            attempt = sc.nextInt();
            if (attempt < misteriousNumber) {
                System.out.println("You missed the mysterious number is greater than " + attempt);
            } else if (attempt > misteriousNumber) {
                System.out.println("You missed the mysterious number is smaller than " + attempt);
            }
        } while (attempt != misteriousNumber);
        System.out.println("You GET IT the misterious number is " + misteriousNumber + " and you tried: " + attempt);
        sc.close();

    }
}
