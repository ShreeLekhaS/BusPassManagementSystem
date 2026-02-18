

package model;

public class Payment {
    private int paymentId;
    private int passengerId;
    private double amount;
    private String paymentDate;
    private String paymentMode;
    private String paymentStatus;

    public Payment(int paymentId, int passengerId,
                   double amount, String paymentDate,
                   String paymentMode) {
        this.paymentId = paymentId;
        this.passengerId = passengerId;
        this.amount = amount;
        this.paymentDate = paymentDate;
        this.paymentMode = paymentMode;
        this.paymentStatus = "Success";
    }
}
