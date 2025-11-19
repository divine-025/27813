package d27813.q4;

public class Product extends Supplier {
    private String productName;
    private double unitPrice;
    private int quantity;

    public Product(int id, java.util.Date createdDate, java.util.Date updatedDate,
                   String orgName, String address, String contactEmail,
                   String deptName, String deptCode,
                   String supplierName, String supplierTIN, String contact,
                   String productName, double unitPrice, int quantity) {

        super(id, createdDate, updatedDate, orgName, address, contactEmail, deptName, deptCode,
              supplierName, supplierTIN, contact);

        if (productName == null || productName.isEmpty()) throw new ProcurementDataException("Product name required");
        if (unitPrice <= 0) throw new ProcurementDataException("Unit price must be > 0");
        if (quantity < 0) throw new ProcurementDataException("Quantity must be >= 0");

        this.productName = productName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public String getProductName() { return productName; }
    public double getUnitPrice() { return unitPrice; }
    public int getQuantity() { return quantity; }

    public double lineTotal() {
        return unitPrice * quantity;
    }
}
