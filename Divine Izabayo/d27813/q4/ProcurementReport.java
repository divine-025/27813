package d27813.q4;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public final class ProcurementReport extends Invoice {
    private Date reportDate;
    private String summary;
    private List<Invoice> invoices = new ArrayList<>();

    public ProcurementReport(int id, Date createdDate, Date updatedDate,
                             String orgName, String address, String contactEmail,
                             String deptName, String deptCode,
                             String supplierName, String supplierTIN, String contact,
                             String productName, double unitPrice, int quantity,
                             String poNumber, Date orderDate, double totalAmount,
                             Date deliveryDate, String deliveredBy,
                             String inspectorName, String status, String remarks,
                             String invoiceNo, double invoiceAmount, Date invoiceDate,
                             Date reportDate, String summary) {

        // call super with an initial invoice (we'll still hold a separate list)
        super(id, createdDate, updatedDate, orgName, address, contactEmail, deptName, deptCode,
              supplierName, supplierTIN, contact, productName, unitPrice, quantity,
              poNumber, orderDate, totalAmount, deliveryDate, deliveredBy,
              inspectorName, status, remarks, invoiceNo, invoiceAmount, invoiceDate);

        if (reportDate == null) throw new ProcurementDataException("Report date cannot be null");
        this.reportDate = reportDate;
        this.summary = summary == null ? "" : summary;

        // add the invoice used for super to our list for completeness
        this.invoices.add(this); // 'this' is-a Invoice (legal because Invoice is a superclass)
    }

    // add any invoice to the report (accepts Invoice objects)
    public void addInvoice(Invoice invoice) {
        if (invoice == null) throw new ProcurementDataException("Invoice cannot be null");
        invoices.add(invoice);
    }

    public List<Invoice> getInvoices() {
        return new ArrayList<>(invoices);
    }

    public Date getReportDate() { return reportDate; }
    public String getSummary() { return summary; }

    // sum of all invoice amounts
    public double calculateTotal() {
        double total = 0.0;
        for (Invoice inv : invoices) {
            total += inv.getInvoiceAmount();
        }
        return total;
    }
}
