package DesignPatterns.Behavioral.Strategy;

public class BikePathCalculator implements PathCalculator{
    @Override
    public void findPath() {
        System.out.println("Calculated path using bike");
    }
}
