
package d27813.q1;
public class Product extends Supplier {
    private String productName;
    private double unitPrice;
    private int stockLimit;

    public Product(int id, java.util.Date c, java.util.Date u,
                   String whName, String loc, String phone,
                   String catName, String catCode,
                   String supName, String supEmail, String supPhone,
                   String productName, double unitPrice, int stockLimit) {
        super(id, c, u, whName, loc, phone, catName, catCode, supName, supEmail, supPhone);

        if (unitPrice <= 0) throw new IllegalArgumentException("Price must be >0");
        if (stockLimit < 0) throw new IllegalArgumentException("Stock limit must be >=0");

        this.productName = productName;
        this.unitPrice = unitPrice;
        this.stockLimit = stockLimit;
    }
}
