import java.util.Scanner;

public class SumUntillEnterZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = -1; //Initialized variable without use do-while loop
        int totalNumbers = 0; //Initialized variable

        while(number!=0){
            System.out.println("Enter the number: ");
            number = sc.nextInt();
            totalNumbers+=number;
            System.out.println("Counting the numbers: " + totalNumbers);
        }
        System.out.println(totalNumbers);


        sc.close();
    }
}
