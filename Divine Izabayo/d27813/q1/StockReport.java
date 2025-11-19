package d27813.q1;

public final class StockReport extends Inventory {
    private java.util.Date reportDate;
    private String remarks;

    public StockReport(int id, java.util.Date c, java.util.Date u,
                       String whName, String loc, String phone,
                       String catName, String catCode,
                       String supName, String supEmail, String supPhone,
                       String productName, double unitPrice, int stockLimit,
                       int quantityAvailable, int reorderLevel,
                       java.util.Date purchaseDate, int purchasedQuantity, String supplierName2,
                       java.util.Date saleDate, int soldQuantity, String customerName,
                       int totalItems, double stockValue,
                       java.util.Date reportDate, String remarks) {

        super(id, c, u, whName, loc, phone,
              catName, catCode,
              supName, supEmail, supPhone,
              productName, unitPrice, stockLimit,
              quantityAvailable, reorderLevel,
              purchaseDate, purchasedQuantity, supplierName2,
              saleDate, soldQuantity, customerName,
              totalItems, stockValue);

        if (reportDate == null)
            throw new IllegalArgumentException("Report date cannot be null");

        this.reportDate = reportDate;
        this.remarks = remarks;
    }

    public String generateReport() {
        return "STOCK REPORT\nTotal Items: " + getTotalItems() +
               "\nStock Value: " + getStockValue() +
               "\nRemarks: " + remarks;
    }
}
