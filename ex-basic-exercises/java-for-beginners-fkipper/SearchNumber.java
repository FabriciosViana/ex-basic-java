import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class SearchNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int[] numbers = new int[20];

        //Fill the vector
        System.out.println("Fill the list with 20 numbers: ");
        for (int i=0; i< numbers.length; i++){
            numbers[i] = sc.nextInt();
        }

        //Choose number
        int whatsNumberArray = sc.nextInt();
        //Check number
        for (int i=0; i<numbers.length; i++){
            if (whatsNumberArray == numbers[i]) {
                System.out.println("YEAHH!, you get it" + whatsNumberArray + " is equal the " + numbers[i]);
            }

        }
        System.out.println("MISS.... you try: " + whatsNumberArray + " and the right number is: " + Arrays.toString(numbers));

//        System.out.println("Your list is: " + Arrays.toString(numbers));


        sc.close();
    }
}
