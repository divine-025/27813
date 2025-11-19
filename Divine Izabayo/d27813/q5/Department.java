package d27813.q5;

public class Department extends Institution {
    private String departmentName;
    private String departmentHead;

    public Department(int id, java.util.Date createdDate, java.util.Date updatedDate,
                      String institutionName, String code, String address,
                      String departmentName, String departmentHead) {
        super(id, createdDate, updatedDate, institutionName, code, address);

        if (departmentName == null || departmentName.isEmpty()) throw new AttendanceDataException("Department name required");
        if (departmentHead == null || departmentHead.isEmpty()) throw new AttendanceDataException("Department head required");

        this.departmentName = departmentName;
        this.departmentHead = departmentHead;
    }

    public String getDepartmentName() { return departmentName; }
    public String getDepartmentHead() { return departmentHead; }
}
