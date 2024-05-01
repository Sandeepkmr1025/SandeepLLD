package Misc;

import java.util.HashMap;

public class HashMapInternal {

    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        hashMap.put("key1", 12);
        hashMap.put("key2", 22);
        hashMap.put(null, 32);
        hashMap.put(null, 42);

        System.out.println(hashMap);
    }
}
