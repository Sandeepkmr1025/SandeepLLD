package DesignPatterns.Behavioral.Strategy;

public class PathCalculatorFactory {

    private  static final WalkPathCalculator walkPathCalculator = new WalkPathCalculator();
    private  static final BikePathCalculator bikePathCalculator = new BikePathCalculator();
    private  static final CarPathCalculator carPathCalculator = new CarPathCalculator();

    public static PathCalculator getPathCalculator(TransportationMode mode)
    {
        return switch (mode) {
            case WALK -> walkPathCalculator;
            case BIKE -> bikePathCalculator;
            case CAR -> carPathCalculator;
        };
    }
}
