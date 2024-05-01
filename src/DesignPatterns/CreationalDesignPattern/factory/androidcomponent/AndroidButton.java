package DesignPatterns.CreationalDesignPattern.factory.androidcomponent;

import DesignPatterns.CreationalDesignPattern.factory.Button;

public class AndroidButton implements Button {
    @Override
    public void changeSize() {
        System.out.println("Changed the size in Android");
    }
}
