package DesignPatterns.Behavioral.Observer;

import java.sql.SQLOutput;

public class AnalyticsSender implements OrderPlacedSubscriber{

    public AnalyticsSender()
    {
        Amazon.getInstance().registerOrder(this);

    }
    @Override
    public ReturnData onOrderPlaced() {
        System.out.println("Sending analytics as order has been placed!");
        return new ReturnData("Success");
    }
}
