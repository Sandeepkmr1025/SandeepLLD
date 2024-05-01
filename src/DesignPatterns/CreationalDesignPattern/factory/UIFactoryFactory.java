package DesignPatterns.CreationalDesignPattern.factory;

import DesignPatterns.CreationalDesignPattern.factory.androidcomponent.AndroidFactory;
import DesignPatterns.CreationalDesignPattern.factory.ioscomponent.IosFactory;

public class UIFactoryFactory {

    public static UIFactory createFactoryBasedOnPlatform(SupportedPlatform supportedPlatform) {
        return switch (supportedPlatform) {
            case IOS -> new IosFactory();
            case ANDROID -> new AndroidFactory();
            default -> new AndroidFactory();
        };
    }
}
