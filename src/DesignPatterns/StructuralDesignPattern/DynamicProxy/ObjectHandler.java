package DesignPatterns.StructuralDesignPattern.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ObjectHandler implements InvocationHandler {

    private final Object object;

    ObjectHandler(Object object)
    {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("Before method call");

        if(method.getName().contains("put"))
        {
            if(args[0].equals("Java"))
            {
                System.out.println("Invalid key : Java");
                return null;
            }
        }

        Object invoke = method.invoke(object, args);

        System.out.println("After method call");
        return invoke;
    }
}
