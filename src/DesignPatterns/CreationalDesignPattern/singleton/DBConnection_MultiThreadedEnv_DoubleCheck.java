package DesignPatterns.CreationalDesignPattern.singleton;
public class DBConnection_MultiThreadedEnv_DoubleCheck {

    private static DBConnection_MultiThreadedEnv_DoubleCheck instance = null;

    private String username;
    private String password;

    private DBConnection_MultiThreadedEnv_DoubleCheck() {
    }

    // It can accept runtime parameters
    public static DBConnection_MultiThreadedEnv_DoubleCheck getInstance() {

        if (instance == null) {

            synchronized (DBConnection_MultiThreadedEnv_DoubleCheck.class)
            {
                if (instance == null) {
                    instance = new DBConnection_MultiThreadedEnv_DoubleCheck();
                }
            }

        }

        return instance;
    }
}
