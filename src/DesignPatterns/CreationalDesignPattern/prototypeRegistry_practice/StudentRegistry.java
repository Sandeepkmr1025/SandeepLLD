package DesignPatterns.CreationalDesignPattern.prototypeRegistry_practice;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry implements Registry<String, Student>{

    Map<String, Student> map = new HashMap<>();
    @Override
    public Student getStudent(String key) {
        return map.get(key);
    }

    @Override
    public void setStudent(String key, Student value) {
        map.put(key, value);
    }
}
