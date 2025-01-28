import java.util.ArrayList;

import java.util.Scanner;

public class FrequencyNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        System.out.println("Enter the size of the list you want: ");
        int quantity = sc.nextInt();

        for (int i=0; i<quantity; i++){
            System.out.println("Enter the number: ");
            int number = sc.nextInt();
            numbers.add(number);
            System.out.println("Number: "+ number + " was add to the array");
        }

        ArrayList<Integer> verifyedNumbers = new ArrayList<Integer>();

        for (int i=0; i<numbers.size(); i++){
            int currentNumber = numbers.get(i);
            if (!verifyedNumbers.contains(currentNumber)){
                verifyedNumbers.add(currentNumber);

                int countFrequency = 0;
                for (int j=0; j<numbers.size(); j++){
                    if (numbers.get(j)==currentNumber){
                        countFrequency++;
                        System.out.println("Número " + currentNumber + " aparece " + countFrequency + " vezes.");
                    }
                }
            }
        }

        System.out.println(numbers);


        sc.close();
    }
}
