import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // integer numbers = 100, 234345, 255
        // byte => 8 bits=> -128 a 127
        // short => 16 bits => -32.768 a 32.767
        // int => 32 bits => -2.147.483.648 a 2.147.483.647
        // long => 64 bits => -9.223.372.063.854.775.808 a 9.223.372.036.854.775.807
        // decimalsNumber => 1.2, 3.4
        // float => 32 bits => precisao simples => 39.23
        // double => 64 bits=> precisao dupla => 35.9816513 more numbers after the .

        // String => text
        // char => one character => a,b,c,d, simples aspas => 'a'
        // boolean => true or false
        byte b = 100;
        short s = 10000;
        int i = 100000;
        long l = 100000L; //-> need have a L in the end
        float f = 10.5f; //-> need have a f in the end
        double d = 20.5;
        char c = 'A';
        String str = "Fabricio";
        boolean bool = true;
        int[] collectionInteger = {1,2,3,4,5};

        ArrayList<String> names = new ArrayList<>();
        names.add("Fernanda");
        names.add("Fabricio");
        names.add("Gui");
        names.add("Pai");

        System.out.println(names.get(3));

        names.remove(0);
        System.out.println(names.get(0));








    }
}

