package d27813.q3;

public class TaxAuthority extends Entity {
    private String authorityName;
    private String region;
    private String email;

    public TaxAuthority(int id, java.util.Date createdDate, java.util.Date updatedDate,
                        String authorityName, String region, String email) {
        super(id, createdDate, updatedDate);
        if (authorityName == null || authorityName.isEmpty()) throw new TaxDataException("Authority name required");
        if (region == null || region.isEmpty()) throw new TaxDataException("Region required");
        if (!isValidEmail(email)) throw new TaxDataException("Invalid email for authority");
        this.authorityName = authorityName;
        this.region = region;
        this.email = email;
    }

    private boolean isValidEmail(String e) {
        return e != null && e.contains("@") && e.contains(".");
    }

    public String getAuthorityName() { return authorityName; }
    public String getRegion() { return region; }
    public String getEmail() { return email; }
}
