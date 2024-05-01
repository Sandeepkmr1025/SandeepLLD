package DesignPatterns.CreationalDesignPattern.factory.androidcomponent;

import DesignPatterns.CreationalDesignPattern.factory.UIFactory;

public class AndroidFactory implements UIFactory {
    @Override
    public AndroidButton createButton() {
        return new AndroidButton();
    }

    @Override
    public AndroidMenu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public AndroidDropdown createDropDown() {
        return new AndroidDropdown();
    }
}
