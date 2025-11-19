package d27813.q6;

public class Employee extends Department {
    private int employeeID; // ≥1000
    private String fullName;
    private String position;
    private double baseSalary; // >0
    private boolean rssbRegistered;

    public Employee(int id, java.util.Date createdDate, java.util.Date updatedDate,
                    String orgName, String orgCode, String rssbNumber, String contactEmail,
                    String deptName, String deptCode, String managerName,
                    int employeeID, String fullName, String position, double baseSalary, boolean rssbRegistered) {

        super(id, createdDate, updatedDate, orgName, orgCode, rssbNumber, contactEmail,
              deptName, deptCode, managerName);

        if (employeeID < 1000) throw new PayrollDataException("Employee ID must be ≥1000");
        if (fullName == null || fullName.isEmpty()) throw new PayrollDataException("Full name required");
        if (position == null || position.isEmpty()) throw new PayrollDataException("Position required");
        if (baseSalary <= 0) throw new PayrollDataException("Base salary must be >0");

        this.employeeID = employeeID;
        this.fullName = fullName;
        this.position = position;
        this.baseSalary = baseSalary;
        this.rssbRegistered = rssbRegistered;
    }

    public int getEmployeeID() { return employeeID; }
    public String getFullName() { return fullName; }
    public String getPosition() { return position; }
    public double getBaseSalary() { return baseSalary; }
    public boolean isRssbRegistered() { return rssbRegistered; }
}
