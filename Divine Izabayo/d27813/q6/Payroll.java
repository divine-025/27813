package d27813.q6;

public class Payroll extends Allowance {
    private double grossSalary;
    private double totalDeductions;
    private double netSalary;

    public Payroll(int id, java.util.Date createdDate, java.util.Date updatedDate,
                   String orgName, String orgCode, String rssbNumber, String contactEmail,
                   String deptName, String deptCode, String managerName,
                   int employeeID, String fullName, String position, double baseSalary, boolean rssbRegistered,
                   int month, int year, java.util.Date startDate, java.util.Date endDate,
                   double basicPay, double transportAllowance, double housingAllowance,
                   double payeTax, double loanDeduction,
                   double overtimeHours, double overtimeRate, double bonus) {

        super(id, createdDate, updatedDate, orgName, orgCode, rssbNumber, contactEmail,
              deptName, deptCode, managerName, employeeID, fullName, position, baseSalary, rssbRegistered,
              month, year, startDate, endDate, basicPay, transportAllowance, housingAllowance,
              payeTax, loanDeduction, overtimeHours, overtimeRate, bonus);

        this.grossSalary = basicPay + transportAllowance + housingAllowance + (overtimeHours * overtimeRate) + bonus;
        this.totalDeductions = getRssbContribution() + getPayeTax() + getLoanDeduction();
        this.netSalary = grossSalary - totalDeductions;
    }

    public double getGrossSalary() { return grossSalary; }
    public double getTotalDeductions() { return totalDeductions; }
    public double getNetSalary() { return netSalary; }
}
