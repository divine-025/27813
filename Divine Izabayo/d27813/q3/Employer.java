package d27813.q3;

public class Employer extends Taxpayer {
    private String employerName;
    private String employerTIN; // assume valid TIN
    private String contact;     // phone 10 digits

    public Employer(int id, java.util.Date createdDate, java.util.Date updatedDate,
                    String authorityName, String region, String email,
                    String categoryName, double rate, String code,
                    String tin, String taxpayerName, String address,
                    String employerName, String employerTIN, String contact) {

        super(id, createdDate, updatedDate, authorityName, region, email, categoryName, rate, code,
              tin, taxpayerName, address);

        if (employerName == null || employerName.isEmpty()) throw new TaxDataException("Employer name required");
        if (employerTIN == null || !employerTIN.matches("\\d{9}")) throw new TaxDataException("Employer TIN must be 9 digits");
        if (contact == null || !contact.matches("\\d{10}")) throw new TaxDataException("Contact must be 10 digits");

        this.employerName = employerName;
        this.employerTIN = employerTIN;
        this.contact = contact;
    }

    public String getEmployerName() { return employerName; }
    public String getEmployerTIN() { return employerTIN; }
    public String getContact() { return contact; }
}
