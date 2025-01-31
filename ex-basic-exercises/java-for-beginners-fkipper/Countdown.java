import java.util.Scanner;

public class Countdown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive number: ");
        int count = sc.nextInt();


        if (count<=0){
            System.out.println("Please enter a positive number: ");
        }else{
            while (count>=0){
                System.out.println(count);
                count--;
            }
        }

        sc.close();
    }
}
