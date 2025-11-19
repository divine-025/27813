package d27813.q3;

import java.util.Date;

public class TaxAssessment extends TaxDeclaration {
    private Date assessmentDate;
    private double assessedTax; // >= 0

    public TaxAssessment(int id, Date createdDate, Date updatedDate,
                         String authorityName, String region, String email,
                         String categoryName, double rate, String code,
                         String tin, String taxpayerName, String address,
                         String employerName, String employerTIN, String contact,
                         String employeeName, double salary, String employeeTIN,
                         String declarationMonth, double totalIncome,
                         Date assessmentDate, double assessedTax) {

        super(id, createdDate, updatedDate, authorityName, region, email, categoryName, rate, code,
              tin, taxpayerName, address, employerName, employerTIN, contact,
              employeeName, salary, employeeTIN, declarationMonth, totalIncome);

        if (assessmentDate == null) throw new TaxDataException("Assessment date cannot be null");
        if (assessedTax < 0) throw new TaxDataException("Assessed tax must be >= 0");

        this.assessmentDate = assessmentDate;
        this.assessedTax = assessedTax;
    }

    public Date getAssessmentDate() { return assessmentDate; }
    public double getAssessedTax() { return assessedTax; }
}
