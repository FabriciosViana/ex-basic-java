import java.util.*;

public class OrderNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        System.out.println("Enter the size of the list you want: ");
        int quantity = sc.nextInt();

        //Adding numbers in the array
        for (int i=0; i<quantity; i++){
            System.out.println("Enter the number: ");
            int number = sc.nextInt();
            numbers.add(number);
            System.out.println("Number: "+ number + " Add to array");
        }

        //Method to order ArrayList
        Collections.sort(numbers);

        System.out.println(numbers);


        sc.close();
    }
}
