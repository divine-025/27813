package d27813.q3;

public class Taxpayer extends TaxCategory {
    private String tin; // 9 digits
    private String taxpayerName;
    private String address;

    public Taxpayer(int id, java.util.Date createdDate, java.util.Date updatedDate,
                    String authorityName, String region, String email,
                    String categoryName, double rate, String code,
                    String tin, String taxpayerName, String address) {

        super(id, createdDate, updatedDate, authorityName, region, email, categoryName, rate, code);

        if (tin == null || !tin.matches("\\d{9}")) throw new TaxDataException("TIN must be 9 digits");
        if (taxpayerName == null || taxpayerName.isEmpty()) throw new TaxDataException("Taxpayer name required");
        if (address == null || address.isEmpty()) throw new TaxDataException("Address required");

        this.tin = tin;
        this.taxpayerName = taxpayerName;
        this.address = address;
    }

    public String getTin() { return tin; }
    public String getTaxpayerName() { return taxpayerName; }
    public String getAddress() { return address; }
}
