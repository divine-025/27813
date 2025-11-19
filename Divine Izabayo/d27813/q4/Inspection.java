package d27813.q4;

public class Inspection extends Delivery {
    private String inspectorName;
    private String status; // "Passed" or "Failed"
    private String remarks;

    public Inspection(int id, java.util.Date createdDate, java.util.Date updatedDate,
                      String orgName, String address, String contactEmail,
                      String deptName, String deptCode,
                      String supplierName, String supplierTIN, String contact,
                      String productName, double unitPrice, int quantity,
                      String poNumber, java.util.Date orderDate, double totalAmount,
                      java.util.Date deliveryDate, String deliveredBy,
                      String inspectorName, String status, String remarks) {

        super(id, createdDate, updatedDate, orgName, address, contactEmail, deptName, deptCode,
              supplierName, supplierTIN, contact, productName, unitPrice, quantity, poNumber, orderDate, totalAmount,
              deliveryDate, deliveredBy);

        if (inspectorName == null || inspectorName.isEmpty()) throw new ProcurementDataException("Inspector name required");
        if (!(status.equals("Passed") || status.equals("Failed")))
            throw new ProcurementDataException("Status must be 'Passed' or 'Failed'");

        this.inspectorName = inspectorName;
        this.status = status;
        this.remarks = remarks == null ? "" : remarks;
    }

    public String getInspectorName() { return inspectorName; }
    public String getStatus() { return status; }
    public String getRemarks() { return remarks; }
}
