package d27813.q6;

public class Deduction extends SalaryStructure {
    private double rssbContribution; 
    private double payeTax;           
    private double loanDeduction;     

    public Deduction(int id, java.util.Date createdDate, java.util.Date updatedDate,
                     String orgName, String orgCode, String rssbNumber, String contactEmail,
                     String deptName, String deptCode, String managerName,
                     int employeeID, String fullName, String position, double baseSalary, boolean rssbRegistered,
                     int month, int year, java.util.Date startDate, java.util.Date endDate,
                     double basicPay, double transportAllowance, double housingAllowance,
                     double payeTax, double loanDeduction) {

        super(id, createdDate, updatedDate, orgName, orgCode, rssbNumber, contactEmail,
              deptName, deptCode, managerName, employeeID, fullName, position, baseSalary, rssbRegistered,
              month, year, startDate, endDate, basicPay, transportAllowance, housingAllowance);

        if (payeTax < 0 || loanDeduction < 0) throw new PayrollDataException("Deductions must be ≥0");
        this.rssbContribution = basicPay * 0.05; // 5%
        this.payeTax = payeTax;
        this.loanDeduction = loanDeduction;
    }

    public double getRssbContribution() { return rssbContribution; }
    public double getPayeTax() { return payeTax; }
    public double getLoanDeduction() { return loanDeduction; }
}
