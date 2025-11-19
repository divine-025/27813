package d27813.q6;

import java.util.Date;

public final class Payslip extends Payroll {
    private String payslipNumber;
    private Date issueDate;

    public Payslip(int id, java.util.Date createdDate, java.util.Date updatedDate,
                   String orgName, String orgCode, String rssbNumber, String contactEmail,
                   String deptName, String deptCode, String managerName,
                   int employeeID, String fullName, String position, double baseSalary, boolean rssbRegistered,
                   int month, int year, java.util.Date startDate, java.util.Date endDate,
                   double basicPay, double transportAllowance, double housingAllowance,
                   double payeTax, double loanDeduction,
                   double overtimeHours, double overtimeRate, double bonus,
                   String payslipNumber, Date issueDate) {

        super(id, createdDate, updatedDate, orgName, orgCode, rssbNumber, contactEmail,
              deptName, deptCode, managerName, employeeID, fullName, position, baseSalary, rssbRegistered,
              month, year, startDate, endDate, basicPay, transportAllowance, housingAllowance,
              payeTax, loanDeduction, overtimeHours, overtimeRate, bonus);

        if (payslipNumber == null || payslipNumber.isEmpty()) throw new PayrollDataException("Payslip number required");
        if (issueDate == null) throw new PayrollDataException("Issue date cannot be null");

        this.payslipNumber = payslipNumber;
        this.issueDate = issueDate;
    }

    public String getPayslipNumber() { return payslipNumber; }
    public Date getIssueDate() { return issueDate; }

    public void generatePayslip() {
        System.out.println("=== Payslip ===");
        System.out.println("Payslip No: " + payslipNumber);
        System.out.println("Issue Date: " + issueDate);
        System.out.println("Employee: " + getFullName() + " (" + getEmployeeID() + ")");
        System.out.println("Position: " + getPosition());
        System.out.printf("Basic Pay: %.2f\n", getBasicPay());
        System.out.printf("Transport Allowance: %.2f\n", getTransportAllowance());
        System.out.printf("Housing Allowance: %.2f\n", getHousingAllowance());
        System.out.printf("Overtime: %.2f x %.2f = %.2f\n", getOvertimeHours(), getOvertimeRate(), getOvertimeHours()*getOvertimeRate());
        System.out.printf("Bonus: %.2f\n", getBonus());
        System.out.printf("Gross Salary: %.2f\n", getGrossSalary());
        System.out.printf("RSSB Contribution: %.2f\n", getRssbContribution());
        System.out.printf("PAYE Tax: %.2f\n", getPayeTax());
        System.out.printf("Loan Deduction: %.2f\n", getLoanDeduction());
        System.out.printf("Total Deductions: %.2f\n", getTotalDeductions());
        System.out.printf("Net Salary: %.2f\n", getNetSalary());
        System.out.println("OUTPUT | d27813");
    }
}
