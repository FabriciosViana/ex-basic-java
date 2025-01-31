import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size of the list you want: ");
//        String word = sc.nextLine();
//        String reverseWord = sc.nextLine();
//
//        for (int i=(word.length()-1); i>=0; i--){
//            reverseWord+=word.charAt(i);
//        }
//        if (reverseWord.equals(word)){
//            System.out.println(word + " Is a palindrome");
//        }else {
//            System.out.println(word + "Is not a palndrome");
//        }
//
//        System.out.println(word);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the list you want: ");
        ArrayList<String> words = new ArrayList<String>();
        System.out.println("How many words you would adding to the array? ");
        int quantityWords = sc.nextInt();
        sc.nextLine();

        //Fill the arraylist
        for (int i=0; i<quantityWords; i++){
            System.out.println("Enter your text: ");
            String inputWord = sc.nextLine();
            words.add(inputWord);
        }
        for (String word: words){
            String reversedWord = "";
            for (int i=word.length()-1;i>=0;i--){
                reversedWord+=word.charAt(i);
            }

            if (word.equals(reversedWord)){
                System.out.println(word+" Is Palindrome");
            }else{
                System.out.println(word + " Is NOT a Palindrome");
            }
        }






    }
}
