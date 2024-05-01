package DesignPatterns.CreationalDesignPattern.factory;

public class Flutter {

    public void setTheme()
    {
        System.out.println("Setting up the theme.");
    }

    public void refreshRate(int hertz)
    {
        System.out.println("Setting up refresh rate to : " + hertz + " hertz");
    }

    public UIFactory createFactory(SupportedPlatform supportedPlatform)
    {
       return UIFactoryFactory.createFactoryBasedOnPlatform(supportedPlatform);
    }



}
