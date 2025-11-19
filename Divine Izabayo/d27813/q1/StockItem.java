
package d27813.q1;
public class StockItem extends Product {
    private int quantityAvailable;
    private int reorderLevel;

    public StockItem(int id, java.util.Date c, java.util.Date u,
                     String whName, String loc, String phone,
                     String catName, String catCode,
                     String supName, String supEmail, String supPhone,
                     String productName, double unitPrice, int stockLimit,
                     int quantityAvailable, int reorderLevel) {
        super(id, c, u, whName, loc, phone, catName, catCode, supName, supEmail, supPhone,
                productName, unitPrice, stockLimit);

        if (quantityAvailable < 0 || reorderLevel < 0)
            throw new IllegalArgumentException("Values must be >=0");

        this.quantityAvailable = quantityAvailable;
        this.reorderLevel = reorderLevel;
    }
}
