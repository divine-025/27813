package d27813.q4;

public class Department extends Organization {
    private String deptName;
    private String deptCode; // alphanumeric, >=3 chars

    public Department(int id, java.util.Date createdDate, java.util.Date updatedDate,
                      String orgName, String address, String contactEmail,
                      String deptName, String deptCode) {
        super(id, createdDate, updatedDate, orgName, address, contactEmail);

        if (deptName == null || deptName.isEmpty()) throw new ProcurementDataException("Department name required");
        if (deptCode == null || deptCode.length() < 3 || !deptCode.matches("[A-Za-z0-9]+"))
            throw new ProcurementDataException("Department code must be alphanumeric and >= 3 chars");

        this.deptName = deptName;
        this.deptCode = deptCode;
    }

    public String getDeptName() { return deptName; }
    public String getDeptCode() { return deptCode; }
}
