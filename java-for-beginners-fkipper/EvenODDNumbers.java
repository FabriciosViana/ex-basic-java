import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class EvenODDNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] receiveNumbers = new int[10];
        System.out.println("Enter 10 numbers to fill the list ");
        //Add numbers into vector
        for (int i=0; i < receiveNumbers.length; i++){
            receiveNumbers[i] = sc.nextInt();
            System.out.println("You add " + receiveNumbers[i] + " to array");
        }
        System.out.println(Arrays.toString(receiveNumbers));

        //Create Arraylists of Even and Odd numbers
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();

        //Defining even and odd numbers
        for (int i=0; i< receiveNumbers.length; i++){
            if (receiveNumbers[i]%2==0){
                //Add even numbers to array
                evenNumbers.add(receiveNumbers[i]);
                System.out.println(receiveNumbers[i]+ " Even Number");
            } else {
                //Add odd numbers to array
                oddNumbers.add(receiveNumbers[i]);
                System.out.println(receiveNumbers[i]+" Odd Number");
            }
        }

        System.out.println("Even numbers: " + evenNumbers);
        System.out.println("Odd Numbers: " + oddNumbers);
    }
}
