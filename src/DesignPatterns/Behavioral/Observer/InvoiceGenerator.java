package DesignPatterns.Behavioral.Observer;

public class InvoiceGenerator implements OrderPlacedSubscriber{

    public InvoiceGenerator()
    {
        Amazon.getInstance().registerOrder(this);
    }
    @Override
    public ReturnData onOrderPlaced() {
        System.out.println("Generated invoice as order has been placed!");
        return new ReturnData("Success");
    }
}
