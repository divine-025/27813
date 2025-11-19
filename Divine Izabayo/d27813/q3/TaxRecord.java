package d27813.q3;

import java.util.Date;

public final class TaxRecord extends Payment {
    private String receiptNo;
    private double totalTax; // final computed tax

    /**
     * credits: tax credits or reliefs applied (>= 0)
     */
    public TaxRecord(int id, Date createdDate, Date updatedDate,
                     String authorityName, String region, String email,
                     String categoryName, double rate, String code,
                     String tin, String taxpayerName, String address,
                     String employerName, String employerTIN, String contact,
                     String employeeName, double salary, String employeeTIN,
                     String declarationMonth, double totalIncome,
                     Date assessmentDate, double assessedTax,
                     Date paymentDate, double paymentAmount,
                     String receiptNo, double totalTax) {

        super(id, createdDate, updatedDate, authorityName, region, email, categoryName, rate, code,
              tin, taxpayerName, address, employerName, employerTIN, contact,
              employeeName, salary, employeeTIN, declarationMonth, totalIncome,
              assessmentDate, assessedTax, paymentDate, paymentAmount);

        if (receiptNo == null || receiptNo.isEmpty()) throw new TaxDataException("Receipt number required");
        if (totalTax < 0) throw new TaxDataException("Total tax must be >= 0");

        this.receiptNo = receiptNo;
        this.totalTax = totalTax;
    }

    public String getReceiptNo() { return receiptNo; }
    public double getTotalTax() { return totalTax; }

    /**
     * computeTax formula: (salary × rate) – credits
     * returns computed tax (not less than 0)
     */
    public double computeTax(double credits) {
        if (credits < 0) throw new TaxDataException("Credits must be >= 0");
        // navigate back up the inheritance tree to get salary and rate
        double salary = getSalary();
        double rate = getRate();

        double tax = (salary * rate) - credits;
        if (tax < 0) tax = 0;
        this.totalTax = tax;
        return tax;
    }
}
