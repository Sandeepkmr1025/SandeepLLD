package LambdasAndStreams.Lambdas;

public class PrintHelper implements Runnable{

    @Override
    public void run() {
        System.out.println("Hello World : "+Thread.currentThread().getName());
    }
}
