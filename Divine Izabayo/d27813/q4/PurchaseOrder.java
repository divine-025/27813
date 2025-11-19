package d27813.q4;

import java.util.Date;

public class PurchaseOrder extends Product {
    private String poNumber;
    private Date orderDate;
    private double totalAmount; // > 0

    public PurchaseOrder(int id, Date createdDate, Date updatedDate,
                         String orgName, String address, String contactEmail,
                         String deptName, String deptCode,
                         String supplierName, String supplierTIN, String contact,
                         String productName, double unitPrice, int quantity,
                         String poNumber, Date orderDate, double totalAmount) {

        super(id, createdDate, updatedDate, orgName, address, contactEmail, deptName, deptCode,
              supplierName, supplierTIN, contact, productName, unitPrice, quantity);

        if (poNumber == null || poNumber.isEmpty()) throw new ProcurementDataException("PO number required");
        if (orderDate == null) throw new ProcurementDataException("Order date cannot be null");
        if (totalAmount <= 0) throw new ProcurementDataException("Total amount must be > 0");

        this.poNumber = poNumber;
        this.orderDate = orderDate;
        this.totalAmount = totalAmount;
    }

    public String getPoNumber() { return poNumber; }
    public Date getOrderDate() { return orderDate; }
    public double getTotalAmount() { return totalAmount; }
}
