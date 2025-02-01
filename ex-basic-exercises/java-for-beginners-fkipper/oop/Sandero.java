package oop;

public class Sandero implements Car{
    final int limiitOfVelocity = 150;
    public int currentVelocity = 0;
    @Override
    public void accelerate() {
        if (this.currentVelocity < this.limiitOfVelocity){
            this.currentVelocity+=10;
            System.out.println("Accelerating ");
            System.out.println("Current Velocity: " + this.currentVelocity);
        }
    }

    @Override
    public void brake() {

    }

    @Override
    public void stop() {

    }
}
