package oop;

public class Human extends SerVivo{
    public Human() {
        super(42);
    }

    public void respirar() {
        System.out.println(this.age);
        System.out.println("Respirando...");
    }

    @Override
    public void dormir() {
        super.dormir();
    }
}
