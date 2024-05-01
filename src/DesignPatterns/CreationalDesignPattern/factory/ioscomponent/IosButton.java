package DesignPatterns.CreationalDesignPattern.factory.ioscomponent;

import DesignPatterns.CreationalDesignPattern.factory.Button;

public class IosButton implements Button {
    @Override
    public void changeSize() {
        System.out.println("Changed the size in iOS");
    }
}
