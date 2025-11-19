
package d27813.q1;
import java.util.Date;

public class Purchase extends StockItem {
    private Date purchaseDate;
    private int purchasedQuantity;
    private String supplierName2;

    public Purchase(int id, Date c, Date u,
                    String whName, String loc, String phone,
                    String catName, String catCode,
                    String supName, String supEmail, String supPhone,
                    String productName, double unitPrice, int stockLimit,
                    int quantityAvailable, int reorderLevel,
                    Date purchaseDate, int purchasedQuantity, String supplierName2) {
        super(id, c, u, whName, loc, phone, catName, catCode,
              supName, supEmail, supPhone,
              productName, unitPrice, stockLimit,
              quantityAvailable, reorderLevel);

        if (purchaseDate == null)
            throw new IllegalArgumentException("Purchase date cannot be null");
        if (purchasedQuantity <= 0)
            throw new IllegalArgumentException("Quantity must be >0");

        this.purchaseDate = purchaseDate;
        this.purchasedQuantity = purchasedQuantity;
        this.supplierName2 = supplierName2;
    }
}
