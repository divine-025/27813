package d27813.q3;

public class TaxCategory extends TaxAuthority {
    private String categoryName;
    private double rate;   // e.g., 0.15 for 15%
    private String code;

    public TaxCategory(int id, java.util.Date createdDate, java.util.Date updatedDate,
                       String authorityName, String region, String email,
                       String categoryName, double rate, String code) {
        super(id, createdDate, updatedDate, authorityName, region, email);
        if (categoryName == null || categoryName.isEmpty()) throw new TaxDataException("Category name required");
        if (rate <= 0) throw new TaxDataException("Rate must be > 0");
        if (code == null || code.length() < 3) throw new TaxDataException("Code must be at least 3 chars");
        this.categoryName = categoryName;
        this.rate = rate;
        this.code = code;
    }

    public String getCategoryName() { return categoryName; }
    public double getRate() { return rate; }
    public String getCode() { return code; }
}
