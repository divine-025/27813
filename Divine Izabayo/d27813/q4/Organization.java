package d27813.q4;

public class Organization extends Entity {
    private String orgName;
    private String address;
    private String contactEmail;

    public Organization(int id, java.util.Date createdDate, java.util.Date updatedDate,
                        String orgName, String address, String contactEmail) {
        super(id, createdDate, updatedDate);

        if (orgName == null || orgName.isEmpty()) throw new ProcurementDataException("Organization name required");
        if (address == null || address.isEmpty()) throw new ProcurementDataException("Address required");
        if (!isValidEmail(contactEmail)) throw new ProcurementDataException("Invalid contact email");

        this.orgName = orgName;
        this.address = address;
        this.contactEmail = contactEmail;
    }

    private boolean isValidEmail(String e) {
        return e != null && e.contains("@") && e.contains(".");
    }

    public String getOrgName() { return orgName; }
    public String getAddress() { return address; }
    public String getContactEmail() { return contactEmail; }
}
