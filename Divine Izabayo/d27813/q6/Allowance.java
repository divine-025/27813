package d27813.q6;

public class Allowance extends Deduction {
    private double overtimeHours;
    private double overtimeRate;
    private double bonus;

    public Allowance(int id, java.util.Date createdDate, java.util.Date updatedDate,
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
              payeTax, loanDeduction);

        if (overtimeHours < 0 || overtimeRate < 0 || bonus < 0) throw new PayrollDataException("Overtime and bonus must be ≥0");

        this.overtimeHours = overtimeHours;
        this.overtimeRate = overtimeRate;
        this.bonus = bonus;
    }

    public double getOvertimeHours() { return overtimeHours; }
    public double getOvertimeRate() { return overtimeRate; }
    public double getBonus() { return bonus; }
}
