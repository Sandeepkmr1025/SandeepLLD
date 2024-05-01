package LambdasAndStreams.Lambdas;

public class Client2 {

    public static void main(String[] args) {

        /*System.out.println(calculate(8, 10, add()));
        System.out.println(calculate(8, 10, (a, b) -> a - b));
        System.out.println(calculate(8, 10, (a, b) -> a * b));
        System.out.println(calculate(8, 10, (a, b) -> a / b));*/

        /*System.out.println(calculate(8, 10, (a, b)->Operations.add(a, b)));
        System.out.println(calculate(8, 10, (a, b)->Operations.sub(a, b)));
        System.out.println(calculate(8, 10, (a, b)->Operations.multiply(a, b)));
        System.out.println(calculate(8, 10, (a, b)->Operations.divide(a, b)));*/

        /*System.out.println(calculate(8, 10, Operations::add));
        System.out.println(calculate(8, 10, Operations::sub));
        System.out.println(calculate(8, 10, Operations::multiply));
        System.out.println(calculate(8, 10, Operations::divide));*/

        Client2 client2 = new Client2();

        System.out.println(calculate(8, 10, client2::addOperation));
        System.out.println(calculate(8, 10, Operations::sub));
        System.out.println(calculate(8, 10, Operations::multiply));
        System.out.println(calculate(8, 10, Operations::divide));

    }

    public static int calculate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operate(a, b);
    }

    public static MathOperation add()
    {
        return (a, b) -> a + b;
    }

    public int addOperation(int a, int b)
    {
        return a + b;
    }
}
