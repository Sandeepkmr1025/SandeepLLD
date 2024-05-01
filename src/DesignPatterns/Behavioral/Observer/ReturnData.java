package DesignPatterns.Behavioral.Observer;

public class ReturnData {

    private String status;

    public ReturnData(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ReturnData{" +
                "status='" + status + '\'' +
                '}';
    }
}
