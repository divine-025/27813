package d27813.q3;

import java.util.Date;

public class Payment extends TaxAssessment {
    private Date paymentDate;
    private double paymentAmount;

    public Payment(int id, Date createdDate, Date updatedDate,
                   String authorityName, String region, String email,
                   String categoryName, double rate, String code,
                   String tin, String taxpayerName, String address,
                   String employerName, String employerTIN, String contact,
                   String employeeName, double salary, String employeeTIN,
                   String declarationMonth, double totalIncome,
                   Date assessmentDate, double assessedTax,
                   Date paymentDate, double paymentAmount) {

        super(id, createdDate, updatedDate, authorityName, region, email, categoryName, rate, code,
              tin, taxpayerName, address, employerName, employerTIN, contact,
              employeeName, salary, employeeTIN, declarationMonth, totalIncome,
              assessmentDate, assessedTax);

        if (paymentDate == null) throw new TaxDataException("Payment date cannot be null");
        if (paymentAmount <= 0) throw new TaxDataException("Payment amount must be > 0");

        this.paymentDate = paymentDate;
        this.paymentAmount = paymentAmount;
    }

    public Date getPaymentDate() { return paymentDate; }
    public double getPaymentAmount() { return paymentAmount; }
}
