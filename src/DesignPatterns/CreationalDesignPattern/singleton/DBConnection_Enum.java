package DesignPatterns.CreationalDesignPattern.singleton;

public enum DBConnection_Enum {

    INSTANCE;

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
