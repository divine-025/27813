package d27813.q5;

public class Institution extends Entity {
    private String institutionName;
    private String code; // ≥ 3 chars
    private String address;

    public Institution(int id, java.util.Date createdDate, java.util.Date updatedDate,
                       String institutionName, String code, String address) {
        super(id, createdDate, updatedDate);

        if (institutionName == null || institutionName.isEmpty()) throw new AttendanceDataException("Institution name required");
        if (code == null || code.length() < 3) throw new AttendanceDataException("Code must be ≥ 3 chars");
        if (address == null || address.isEmpty()) throw new AttendanceDataException("Address required");

        this.institutionName = institutionName;
        this.code = code;
        this.address = address;
    }

    public String getInstitutionName() { return institutionName; }
    public String getCode() { return code; }
    public String getAddress() { return address; }
}
