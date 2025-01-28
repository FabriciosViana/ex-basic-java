import java.util.ArrayList;
import java.util.Scanner;

public class DuplicatesValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        System.out.println("How much numbers you would add? ");
        int quantity = sc.nextInt();

        //Adding numbers to the array
        for (int i=0; i<quantity;i++){
            System.out.println("Insert a number "+ (i+1));
            int number = sc.nextInt();
            if (!numbers.contains(number)) {
                numbers.add(number);
            }else {
                System.out.println("This number already exist ");
            }
        }
        System.out.println(numbers);

        //Checking duplicates numbers
//        for (int i=0; i<numbers.size(); i++){
//            if (numbers.get(i) == numbers.getLast()){
//                System.out.println("equals !");
//            }else {
//                System.out.println("Not equals !");
//            }
//        }


        sc.close();
    }
}
