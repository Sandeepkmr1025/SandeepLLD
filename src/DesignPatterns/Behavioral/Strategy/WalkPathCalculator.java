package DesignPatterns.Behavioral.Strategy;

public class WalkPathCalculator implements PathCalculator{
    @Override
    public void findPath() {
        System.out.println("Calculated path using walk");
    }
}
