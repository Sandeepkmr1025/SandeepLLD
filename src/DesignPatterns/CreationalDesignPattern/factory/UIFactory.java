package DesignPatterns.CreationalDesignPattern.factory;

public interface UIFactory {

    Button createButton();

    Menu createMenu();

    Dropdown createDropDown();

}
