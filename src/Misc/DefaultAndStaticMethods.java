package Misc;

interface Vehicle {
    default void print() {
        System.out.println("I am a vehicle!");
    }

    static void show() {
        System.out.println("Showing a vehicle!");
    }
}

class Car implements Vehicle {
    // Override the default method
    /*@Override
    public void print() {
        System.out.println("I am a car!");
    }*/
}

public class DefaultAndStaticMethods {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.print(); // Prints "I am a car!"
        Vehicle.show();
    }
}
