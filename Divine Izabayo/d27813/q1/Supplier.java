
package d27813.q1;
public class Supplier extends Category {
    private String supplierName;
    private String supplierEmail;
    private String supplierPhone;

    public Supplier(int id, java.util.Date c, java.util.Date u,
                    String whName, String loc, String phone,
                    String categoryName, String categoryCode,
                    String supplierName, String supplierEmail, String supplierPhone) {
        super(id, c, u, whName, loc, phone, categoryName, categoryCode);

        if (!supplierEmail.contains("@"))
            throw new IllegalArgumentException("Invalid email");
        if (supplierPhone.length() != 10)
            throw new IllegalArgumentException("Phone must be 10 digits");

        this.supplierName = supplierName;
        this.supplierEmail = supplierEmail;
        this.supplierPhone = supplierPhone;
    }
}
