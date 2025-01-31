import java.util.Scanner;

public class TableMath {
//  Description: Create a program that requests the user an integer N and displays
//    the multiplication table of that number from 1 to 10.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to see the table: ");
        int n = sc.nextInt();
        int tableNumber= 11;

//      Reminder: I can't iterate directly on an integer,
//      I need to use the "I" aid variable and PRINT it.

        for (int i=0 ; i<tableNumber; i++){
            int tableMath = n * i;
            System.out.println("Table Number " + n + " x " + i + " = " + tableMath);
        }
        sc.close();
    }
}
