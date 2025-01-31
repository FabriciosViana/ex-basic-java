import java.util.Random;
import java.util.Scanner;

public class WhatsNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int whatsNumber = sc.nextInt();
        int misteriousNumber = random.nextInt(2);
        if (whatsNumber == misteriousNumber){
            System.out.println("Nice you target:" + "Misterious Number: " + misteriousNumber + " Your shot: " + whatsNumber );
        }else {
            System.out.println("...MISS: " + "Misterious Number: " + misteriousNumber + " Your shot: " + whatsNumber);
        }
//        System.out.println(misteriousNumber);
    }
}
