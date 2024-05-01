package DesignPatterns.Behavioral.Strategy;

public class GoogleMaps {

    public void findPath(String source, String destination, TransportationMode mode)
    {
        /*if(mode == "CAR")
        {

        }
        if (mode == "BIKE")
        {

        }*/

        PathCalculator pathcalculator = PathCalculatorFactory.getPathCalculator(mode);
        assert pathcalculator != null;
        pathcalculator.findPath();
    }
}
