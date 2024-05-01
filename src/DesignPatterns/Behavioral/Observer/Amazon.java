package DesignPatterns.Behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

public class Amazon {

    private static Amazon instance;

    private List<OrderPlacedSubscriber> orderPlacedSubscribers;
    private List<OrderCancelledSubscriber> orderCancelledSubscribers;

    private Amazon()
    {
        orderPlacedSubscribers = new ArrayList<>();
        orderCancelledSubscribers = new ArrayList<>();
    }

    public static Amazon getInstance()
    {
        if (instance == null) {
            instance = new Amazon();
        }
        return instance;
    }

    public void registerOrder(OrderPlacedSubscriber orderPlacedSubscriber)
    {
        orderPlacedSubscribers.add(orderPlacedSubscriber);
    }

    public void deregisterOrder(OrderPlacedSubscriber orderPlacedSubscriber)
    {
        orderPlacedSubscribers.remove(orderPlacedSubscriber);
    }

    public void registerCancelledOrder(OrderCancelledSubscriber orderCancelledSubscriber)
    {
        orderCancelledSubscribers.add(orderCancelledSubscriber);
    }

    public void deregisterCancelledOrder(OrderCancelledSubscriber orderCancelledSubscriber)
    {
        orderCancelledSubscribers.remove(orderCancelledSubscriber);
    }

    public void orderPlaced()
    {
        //EmailSender
        //InvoiceGenerator
        //AnalyticsSender

        System.out.println("SIZE: "+orderPlacedSubscribers.size());

        orderPlacedSubscribers.stream().map(OrderPlacedSubscriber::onOrderPlaced).forEach(System.out::println);
    }
}
