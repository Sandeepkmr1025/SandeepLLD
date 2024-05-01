package DesignPatterns.CreationalDesignPattern.singleton;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {

    public static void main(String[] args) {

    // In case of multi threaded environment there will be a chance when there will be more than 1 objects may get created for a time being
        DBConnection_SingleThreadedEnv db1 = DBConnection_SingleThreadedEnv.getInstance();
        DBConnection_SingleThreadedEnv db2 = DBConnection_SingleThreadedEnv.getInstance();


// If we have many Singleton classes loaded at application loading that will delay the application start time.
// Can not pass the runtime parameters

//        DBConnection_MultiThreadedEnv db1 = DBConnection_MultiThreadedEnv.getInstance();
//        DBConnection_MultiThreadedEnv db2 = DBConnection_MultiThreadedEnv.getInstance();

        Set<DBConnection_MultiThreadedEnv_DoubleCheck> dbConnectionMultiThreadedEnvs = new HashSet<>();
        ExecutorService executorService = Executors.newCachedThreadPool();

        for (int i = 0; i < 1000; i++) {
            dbConnectionMultiThreadedEnvs.add(DBConnection_MultiThreadedEnv_DoubleCheck.getInstance());
        }

        System.out.println("Size : "+dbConnectionMultiThreadedEnvs.size());

//        if (db1 == db2) {
//            System.out.println("Both are same");
//        } else
//            System.out.println("Both are different");

    }
}
