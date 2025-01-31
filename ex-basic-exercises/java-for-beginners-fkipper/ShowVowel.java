import java.util.Scanner;

public class ShowVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word you want testing: ");
        String wordVowel = sc.nextLine();
        wordVowel = wordVowel.toUpperCase();
        for (int n = 0; n<wordVowel.length(); n++){
            char currentWord = wordVowel.charAt(n);

            if (currentWord == 'A'|| currentWord == 'E' || currentWord == 'I' || currentWord == 'O' || currentWord =='U') {
                System.out.println(currentWord + " Is vowel");
            }
        }

        sc.close();
    }
}
