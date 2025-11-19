package d27813.q4;

import java.util.Date;

public class Invoice extends Inspection {
    private String invoiceNo;
    private double invoiceAmount; // > 0
    private Date invoiceDate;

    public Invoice(int id, java.util.Date createdDate, java.util.Date updatedDate,
                   String orgName, String address, String contactEmail,
                   String deptName, String deptCode,
                   String supplierName, String supplierTIN, String contact,
                   String productName, double unitPrice, int quantity,
                   String poNumber, java.util.Date orderDate, double totalAmount,
                   java.util.Date deliveryDate, String deliveredBy,
                   String inspectorName, String status, String remarks,
                   String invoiceNo, double invoiceAmount, Date invoiceDate) {

        super(id, createdDate, updatedDate, orgName, address, contactEmail, deptName, deptCode,
              supplierName, supplierTIN, contact, productName, unitPrice, quantity, poNumber, orderDate, totalAmount,
              deliveryDate, deliveredBy, inspectorName, status, remarks);

        if (invoiceNo == null || invoiceNo.isEmpty()) throw new ProcurementDataException("Invoice number required");
        if (invoiceAmount <= 0) throw new ProcurementDataException("Invoice amount must be > 0");
        if (invoiceDate == null) throw new ProcurementDataException("Invoice date cannot be null");

        this.invoiceNo = invoiceNo;
        this.invoiceAmount = invoiceAmount;
        this.invoiceDate = invoiceDate;
    }

    public String getInvoiceNo() { return invoiceNo; }
    public double getInvoiceAmount() { return invoiceAmount; }
    public Date getInvoiceDate() { return invoiceDate; }
}
