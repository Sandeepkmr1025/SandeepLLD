package LambdasAndStreams.Lambdas;

public class Client {

    public static void main(String[] args) {

        //PrintHelper printHelper = new PrintHelper();
        /*Thread thread = new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("Hello World: " + Thread.currentThread().getName());
                    }
                }
        );
        thread.start();*/

        //new Thread(()->System.out.println("Hello World! : "+Thread.currentThread().getName())).start();

        //MathOperation mathOperation = Integer::sum;
        /*MathOperation mathOperation = (a, b) -> {
            return a - b;
        };*/

        //It has single line statements therefore braces and return statements are not required.
        MathOperation add = (a, b) -> a + b;
        MathOperation sub = (a, b) -> a - b;
        MathOperation multiply = (a, b) -> a * b;
        MathOperation division = (a, b) -> {
            if(b == 0)
            {
                return 0;
            }
            return a / b;
        };

        System.out.println(add.operate(4, 2));
        System.out.println(sub.operate(4, 2));
        System.out.println(multiply.operate(4, 2));
        System.out.println(division.operate(4, 0));
        System.out.println(division.operate(4, 2));

    }
}
