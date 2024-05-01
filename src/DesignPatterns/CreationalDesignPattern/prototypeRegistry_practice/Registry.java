package DesignPatterns.CreationalDesignPattern.prototypeRegistry_practice;

public interface Registry<K, V> {

    V getStudent(K key);

    void setStudent(K key, V value);

}
