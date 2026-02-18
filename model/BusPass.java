
package model;

public class BusPass {
    private int passId;
    private int passengerId;
    private int routeId;
    private String passType;
    private String issueDate;
    private String expiryDate;
    private int validityPeriod;
    private String passStatus;

    public BusPass(int passId, int passengerId, int routeId,
                   String passType, String issueDate,
                   String expiryDate, int validityPeriod) {
        this.passId = passId;
        this.passengerId = passengerId;
        this.routeId = routeId;
        this.passType = passType;
        this.issueDate = issueDate;
        this.expiryDate = expiryDate;
        this.validityPeriod = validityPeriod;
        this.passStatus = "Active";
    }

    public int getPassengerId() {
        return passengerId;
    }

    public String getPassStatus() {
        return passStatus;
    }

    public void setPassStatus(String passStatus) {
        this.passStatus = passStatus;
    }

    public int getPassId() {
        return passId;
    }
}
