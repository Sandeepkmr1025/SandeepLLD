package DesignPatterns.StructuralDesignPattern.DynamicProxy;

import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

public class Client {

    public static void main(String[] args) {

        Map<String, Integer> fees = (Map<String, Integer>) Proxy.newProxyInstance(Map.class.getClassLoader(), new Class[]{Map.class}, new ObjectHandler(new HashMap<>()));

        fees.put("C", 15454);
        fees.put("Java", 25455);

        System.out.println(fees);


    }
}
