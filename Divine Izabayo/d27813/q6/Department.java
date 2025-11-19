package d27813.q6;

public class Department extends Organization {
    private String deptName;
    private String deptCode;
    private String managerName;

    public Department(int id, java.util.Date createdDate, java.util.Date updatedDate,
                      String orgName, String orgCode, String rssbNumber, String contactEmail,
                      String deptName, String deptCode, String managerName) {
        super(id, createdDate, updatedDate, orgName, orgCode, rssbNumber, contactEmail);

        if (deptName == null || deptName.isEmpty()) throw new PayrollDataException("Department name required");
        if (deptCode == null || deptCode.length() < 3) throw new PayrollDataException("Dept code must be ≥3 chars");
        if (managerName == null || managerName.isEmpty()) throw new PayrollDataException("Manager name required");

        this.deptName = deptName;
        this.deptCode = deptCode;
        this.managerName = managerName;
    }

    public String getDeptName() { return deptName; }
    public String getDeptCode() { return deptCode; }
    public String getManagerName() { return managerName; }
}
