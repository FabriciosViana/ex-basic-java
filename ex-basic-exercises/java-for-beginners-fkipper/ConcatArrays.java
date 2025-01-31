import java.util.ArrayList;
import java.util.Arrays;

public class ConcatArrays {
    public static void main(String[] args) {
        ArrayList<Integer> numbersB = new ArrayList<Integer>();
        ArrayList<Integer> numbersA = new ArrayList<Integer>();
        numbersA.add(1);
        numbersA.add(2);
        numbersA.add(3);
        numbersA.add(4);
        numbersA.add(5);
        System.out.println(numbersA);
        numbersB.add(6);
        numbersB.add(7);
        numbersB.add(8);
        numbersB.add(9);
        numbersB.add(10);
        ArrayList<Integer> numbersC = new ArrayList<Integer>();

        //Insert to numbersA elements
        for (int i = 0; i < numbersA.size(); i++) {
            numbersC.add(numbersA.get(i));
            System.out.println("The element "+numbersA.get(i)+ " was inserted.");
        }

        //Insert to numbersB elements
        for (int i = 0; i < numbersB.size(); i++) {
            numbersC.add(numbersB.get(i));
            System.out.println("The element "+numbersB.get(i)+ " was inserted.");
        }

        System.out.println(numbersC);
    }


}
