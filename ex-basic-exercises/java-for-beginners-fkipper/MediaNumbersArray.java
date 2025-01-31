import java.util.Arrays;
import java.util.Scanner;

public class MediaNumbersArray {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("First number: ");
        numbers[0] = sc.nextInt();
        System.out.println("Second number: ");
        numbers[1] = sc.nextInt();
        System.out.println("Third number: ");
        numbers[2] = sc.nextInt();
        System.out.println("Fourth number: ");
        numbers[3] = sc.nextInt();
        System.out.println("Fifth number: ");
        numbers[4] = sc.nextInt();
        System.out.println(Arrays.toString(numbers));
        int totalElementsVector = 0;
        for(int i=0; i<numbers.length; i++){
            totalElementsVector += numbers[i] ;
            System.out.println(numbers[i]);
            System.out.println(totalElementsVector);
        }
        int mediaCalculate = totalElementsVector/numbers.length;
        System.out.println("The media is: " + mediaCalculate);
    }
}
