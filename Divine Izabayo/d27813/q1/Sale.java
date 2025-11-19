
package d27813.q1;
import java.util.Date;

public class Sale extends Purchase {
    private Date saleDate;
    private int soldQuantity;
    private String customerName;

    public Sale(int id, Date c, Date u,
                String whName, String loc, String phone,
                String catName, String catCode,
                String supName, String supEmail, String supPhone,
                String productName, double unitPrice, int stockLimit,
                int quantityAvailable, int reorderLevel,
                Date purchaseDate, int purchasedQuantity, String supplierName2,
                Date saleDate, int soldQuantity, String customerName) {
        super(id, c, u, whName, loc, phone, catName, catCode,
              supName, supEmail, supPhone,
              productName, unitPrice, stockLimit,
              quantityAvailable, reorderLevel,
              purchaseDate, purchasedQuantity, supplierName2);

        if (saleDate == null) throw new IllegalArgumentException("Sale date cannot be null");
        if (soldQuantity <= 0) throw new IllegalArgumentException("Sold quantity must be > 0");

        this.saleDate = saleDate;
        this.soldQuantity = soldQuantity;
        this.customerName = customerName;
    }
}
