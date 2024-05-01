package LambdasAndStreams.Lambdas.Function;

import java.util.function.Function;

public class Client {

    public static void main(String[] args) {
        String str = "hElLo";
        String command = "normal";

        switch (command) {
            case "lower":
                System.out.println(lowerCase(str));
                break;
            case "upper":
                System.out.println(upperCase(str));
                break;
            case "normal":
                System.out.println(normalCase(str));
                break;
        }

    }

    public static String lowerCase(String str) {
        return execute(str, String::toLowerCase);
    }

    public static String upperCase(String str) {
        return execute(str, String::toUpperCase);
    }

    public static String normalCase(String str) {
        return execute(str, s->s);
    }

    public static String execute(String s, Function<String, String> function) {
        return function.apply(s);

    }
}
