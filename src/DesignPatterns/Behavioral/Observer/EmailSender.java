package DesignPatterns.Behavioral.Observer;

public class EmailSender implements OrderPlacedSubscriber{

    public EmailSender()
    {
        Amazon.getInstance().registerOrder(this);
    }

    @Override
    public ReturnData onOrderPlaced() {
        System.out.println("Sending email as order has been placed!");
        return new ReturnData("Success");
    }
}
