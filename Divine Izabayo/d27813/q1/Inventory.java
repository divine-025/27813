
package d27813.q1;

public class Inventory extends Sale {
    private int totalItems;
    private double stockValue;

    public Inventory(int id, java.util.Date c, java.util.Date u,
                     String whName, String loc, String phone,
                     String catName, String catCode,
                     String supName, String supEmail, String supPhone,
                     String productName, double unitPrice, int stockLimit,
                     int quantityAvailable, int reorderLevel,
                     java.util.Date purchaseDate, int purchasedQuantity, String supplierName2,
                     java.util.Date saleDate, int soldQuantity, String customerName,
                     int totalItems, double stockValue) {
        super(id, c, u, whName, loc, phone, catName, catCode,
              supName, supEmail, supPhone,
              productName, unitPrice, stockLimit,
              quantityAvailable, reorderLevel,
              purchaseDate, purchasedQuantity, supplierName2,
              saleDate, soldQuantity, customerName);

        if (totalItems < 0 || stockValue < 0)
            throw new IllegalArgumentException("Totals must be >=0");

        this.totalItems = totalItems;
        this.stockValue = stockValue;
    }

    public int getTotalItems() { return totalItems; }
    public double getStockValue() { return stockValue; }
}
