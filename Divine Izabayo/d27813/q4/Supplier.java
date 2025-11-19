package d27813.q4;

public class Supplier extends Department {
    private String supplierName;
    private String supplierTIN; // 9 digits
    private String contact;     // phone 10 digits

    public Supplier(int id, java.util.Date createdDate, java.util.Date updatedDate,
                    String orgName, String address, String contactEmail,
                    String deptName, String deptCode,
                    String supplierName, String supplierTIN, String contact) {

        super(id, createdDate, updatedDate, orgName, address, contactEmail, deptName, deptCode);

        if (supplierName == null || supplierName.isEmpty()) throw new ProcurementDataException("Supplier name required");
        if (supplierTIN == null || !supplierTIN.matches("\\d{9}")) throw new ProcurementDataException("Supplier TIN must be 9 digits");
        if (contact == null || !contact.matches("\\d{10}")) throw new ProcurementDataException("Contact must be 10 digits");

        this.supplierName = supplierName;
        this.supplierTIN = supplierTIN;
        this.contact = contact;
    }

    public String getSupplierName() { return supplierName; }
    public String getSupplierTIN() { return supplierTIN; }
    public String getContact() { return contact; }
}
