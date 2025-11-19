package d27813.q3;

public class TaxDeclaration extends Employee {
    private String declarationMonth; // e.g., "2025-10"
    private double totalIncome;      // >= 0

    public TaxDeclaration(int id, java.util.Date createdDate, java.util.Date updatedDate,
                          String authorityName, String region, String email,
                          String categoryName, double rate, String code,
                          String tin, String taxpayerName, String address,
                          String employerName, String employerTIN, String contact,
                          String employeeName, double salary, String employeeTIN,
                          String declarationMonth, double totalIncome) {

        super(id, createdDate, updatedDate, authorityName, region, email, categoryName, rate, code,
              tin, taxpayerName, address, employerName, employerTIN, contact,
              employeeName, salary, employeeTIN);

        if (declarationMonth == null || declarationMonth.isEmpty()) throw new TaxDataException("Declaration month required");
        if (totalIncome < 0) throw new TaxDataException("Total income must be >= 0");

        this.declarationMonth = declarationMonth;
        this.totalIncome = totalIncome;
    }

    public String getDeclarationMonth() { return declarationMonth; }
    public double getTotalIncome() { return totalIncome; }
}
