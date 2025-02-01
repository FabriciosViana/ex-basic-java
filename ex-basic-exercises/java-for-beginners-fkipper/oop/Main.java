package oop;

public class Main {
    public static void main(String[] args) {
        Car sandero = new Sandero();
        Car mobi = new Mobi();
        mobi.accelerate();
        Car myCarBroken = null;
        try {
            myCarBroken.accelerate();
        }catch (NullPointerException exception){
            System.out.println("Sell broken car");
        }
    }
}

