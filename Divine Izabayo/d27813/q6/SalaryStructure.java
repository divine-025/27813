package d27813.q6;

public class SalaryStructure extends PayrollPeriod {
    private double basicPay;
    private double transportAllowance;
    private double housingAllowance;

    public SalaryStructure(int id, java.util.Date createdDate, java.util.Date updatedDate,
                           String orgName, String orgCode, String rssbNumber, String contactEmail,
                           String deptName, String deptCode, String managerName,
                           int employeeID, String fullName, String position, double baseSalary, boolean rssbRegistered,
                           int month, int year, java.util.Date startDate, java.util.Date endDate,
                           double basicPay, double transportAllowance, double housingAllowance) {

        super(id, createdDate, updatedDate, orgName, orgCode, rssbNumber, contactEmail,
              deptName, deptCode, managerName, employeeID, fullName, position, baseSalary, rssbRegistered,
              month, year, startDate, endDate);

        if (basicPay < 0 || transportAllowance < 0 || housingAllowance < 0)
            throw new PayrollDataException("Salary and allowances must be ≥0");

        this.basicPay = basicPay;
        this.transportAllowance = transportAllowance;
        this.housingAllowance = housingAllowance;
    }

    public double getBasicPay() { return basicPay; }
    public double getTransportAllowance() { return transportAllowance; }
    public double getHousingAllowance() { return housingAllowance; }
}
