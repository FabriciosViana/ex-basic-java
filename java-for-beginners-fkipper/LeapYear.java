import java.util.Locale;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.println("Input a year: ");
        int year = sc.nextInt();

        if (year%4== 0 && year%100!=0){
            System.out.println("Is a Leap Year !");
        } else if (year%400==0) {
            System.out.println("Leap Year!");
        }else {
            System.out.println("Is not a Leap Year");
        }


    }
}
