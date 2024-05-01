package DesignPatterns.CreationalDesignPattern.singleton;
public class DBConnection_MultiThreadedEnv {

    private static DBConnection_MultiThreadedEnv instance = new DBConnection_MultiThreadedEnv();

    private String username;
    private String password;

    private DBConnection_MultiThreadedEnv() {
    }

    public static DBConnection_MultiThreadedEnv getInstance() {
        return instance;
    }
}
