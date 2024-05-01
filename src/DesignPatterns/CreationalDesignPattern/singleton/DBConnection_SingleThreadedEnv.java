package DesignPatterns.CreationalDesignPattern.singleton;
public class DBConnection_SingleThreadedEnv {

    private static DBConnection_SingleThreadedEnv instance = null;

    private String username;
    private String password;

    private DBConnection_SingleThreadedEnv() {
    }

    public static DBConnection_SingleThreadedEnv getInstance() {

        if(instance == null) {
            instance = new DBConnection_SingleThreadedEnv();
        }
        return instance;
    }
}
