import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the list you want: ");
        ArrayList<String> words = new ArrayList<String>();
        int sizeArray = sc.nextInt();

        //Adding array elements
        for (int i=0; i<sizeArray; i++){
            System.out.println("Enter the string: ");
            String addWords = sc.next();
            words.add(addWords);
        }


        ArrayList<String> invertedWords = new ArrayList<String>();
        for (int x=words.size()-1; x>=0 ;x--){
            System.out.println(words.get(x));
        }




        System.out.println(words);






        sc.close();
    }
}
