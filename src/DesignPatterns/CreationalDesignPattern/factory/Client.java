package DesignPatterns.CreationalDesignPattern.factory;

public class Client {

    public static void main(String[] args) {
        Flutter flutter = new Flutter();

        UIFactory uiFactory = flutter.createFactory(SupportedPlatform.KAIOS);

        Button button = uiFactory.createButton();
        button.changeSize();



    }
}
