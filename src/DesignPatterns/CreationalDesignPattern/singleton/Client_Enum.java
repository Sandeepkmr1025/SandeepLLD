package DesignPatterns.CreationalDesignPattern.singleton;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client_Enum {

    public static void main(String[] args) {



        Set<DBConnection_Enum> dbConnectionMultiThreadedEnvs = new HashSet<>();
        ExecutorService executorService = Executors.newCachedThreadPool();



        for (int i = 0; i < 1000; i++) {
            dbConnectionMultiThreadedEnvs.add(DBConnection_Enum.INSTANCE);
        }

        System.out.println("Size : "+dbConnectionMultiThreadedEnvs.size());
        executorService.shutdown();

//        if (db1 == db2) {
//            System.out.println("Both are same");
//        } else
//            System.out.println("Both are different");

    }
}
