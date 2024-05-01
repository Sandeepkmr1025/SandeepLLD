package DesignPatterns.Behavioral.Strategy;

public class CarPathCalculator implements PathCalculator{
    @Override
    public void findPath() {
        System.out.println("Calculated path using car");
    }
}
