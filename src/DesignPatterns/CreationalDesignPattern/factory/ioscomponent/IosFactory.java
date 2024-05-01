package DesignPatterns.CreationalDesignPattern.factory.ioscomponent;

import DesignPatterns.CreationalDesignPattern.factory.UIFactory;

public class IosFactory implements UIFactory {
    @Override
    public IosButton createButton() {
        return new IosButton();
    }

    @Override
    public IosMenu createMenu() {
        return new IosMenu();
    }

    @Override
    public IosDropdown createDropDown() {
        return new IosDropdown();
    }
}
