import java.util.Locale;
import java.util.Scanner;

public class SystemSchoolNotes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        //use datastructure byte, because he limit a 100
        System.out.println("Enter the student note: ");
        byte note = sc.nextByte();

        if (note>=90 && note <= 100){
            System.out.println("A: 90 to 100 ");
        }else if (note>=80 && note <= 89) {
            System.out.println("A: 80 to 89 ");
        }else if (note>=70 && note <= 79){
            System.out.println("A: 70 to 79 ");
        }else if (note>=60 && note <= 69){
            System.out.println("A: 60 to 69 ");
        }else if (note<60){
            System.out.println("Under of 60 ");
        }else {
            System.out.println("Enter number in range of 0 to 100 ");
        }

    }
}
