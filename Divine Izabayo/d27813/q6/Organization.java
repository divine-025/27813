package d27813.q6;

public class Organization extends Entity {
    private String orgName;
    private String orgCode;
    private String rssbNumber; 
    private String contactEmail;

    public Organization(int id, java.util.Date createdDate, java.util.Date updatedDate,
                        String orgName, String orgCode, String rssbNumber, String contactEmail) {
        super(id, createdDate, updatedDate);

        if (orgName == null || orgName.isEmpty()) throw new PayrollDataException("Organization name required");
        if (orgCode == null || orgCode.length() < 3) throw new PayrollDataException("Org code must be ≥3 chars");
        if (rssbNumber == null || !rssbNumber.matches("\\d{8}")) throw new PayrollDataException("RSSB number must be 8 digits");
        if (!isValidEmail(contactEmail)) throw new PayrollDataException("Invalid contact email");

        this.orgName = orgName;
        this.orgCode = orgCode;
        this.rssbNumber = rssbNumber;
        this.contactEmail = contactEmail;
    }

    private boolean isValidEmail(String e) { return e != null && e.contains("@") && e.contains("."); }

    public String getOrgName() { return orgName; }
    public String getOrgCode() { return orgCode; }
    public String getRssbNumber() { return rssbNumber; }
    public String getContactEmail() { return contactEmail; }
}
