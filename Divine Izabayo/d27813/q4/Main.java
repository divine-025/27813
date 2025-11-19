package d27813.q4;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String studentID = "d27813";

        try {
            System.out.println("=== Procurement Management System ===");

            // Organization & Department (common)
            System.out.print("Organization name: ");
            String orgName = sc.nextLine();

            System.out.print("Organization address: ");
            String address = sc.nextLine();

            System.out.print("Organization contact email: ");
            String contactEmail = sc.nextLine();

            System.out.print("Department name: ");
            String deptName = sc.nextLine();

            System.out.print("Department code (alphanumeric, >=3 chars): ");
            String deptCode = sc.nextLine();

            // Supplier registration
            System.out.print("Supplier name: ");
            String supplierName = sc.nextLine();

            System.out.print("Supplier TIN (9 digits): ");
            String supplierTIN = sc.nextLine();

            System.out.print("Supplier contact (10 digits): ");
            String supplierContact = sc.nextLine();

            // Product registration
            System.out.print("Product name: ");
            String productName = sc.nextLine();

            System.out.print("Unit price (>0): ");
            double unitPrice = Double.parseDouble(sc.nextLine());

            System.out.print("Quantity (>=0): ");
            int quantity = Integer.parseInt(sc.nextLine());

            // Purchase order
            System.out.print("PO number: ");
            String poNumber = sc.nextLine();

            Date now = new Date();
            double totalAmount = unitPrice * quantity;

            // Delivery details
            System.out.print("Delivered by: ");
            String deliveredBy = sc.nextLine();

            // Inspection
            System.out.print("Inspector name: ");
            String inspectorName = sc.nextLine();

            System.out.print("Inspection status (Passed/Failed): ");
            String status = sc.nextLine();

            System.out.print("Inspection remarks (optional): ");
            String remarks = sc.nextLine();

            // Initial invoice (will also be part of the report)
            System.out.print("Initial invoice number: ");
            String invoiceNo = sc.nextLine();

            System.out.print("Initial invoice amount (>0): ");
            double invoiceAmount = Double.parseDouble(sc.nextLine());

            Date invoiceDate = new Date();

            // Build initial ProcurementReport (this also registers one invoice implicitly)
            ProcurementReport report = new ProcurementReport(
                    1, now, now,
                    orgName, address, contactEmail,
                    deptName, deptCode,
                    supplierName, supplierTIN, supplierContact,
                    productName, unitPrice, quantity,
                    poNumber, now, totalAmount,
                    now, deliveredBy,
                    inspectorName, status, remarks,
                    invoiceNo, invoiceAmount, invoiceDate,
                    now, "Procurement summary"
            );

            // Optionally add more invoices
            System.out.print("Do you want to add more invoices? (yes/no): ");
            String more = sc.nextLine().trim().toLowerCase();
            while (more.equals("yes")) {
                System.out.print("Enter invoice number: ");
                String invNo = sc.nextLine();

                System.out.print("Enter invoice amount (>0): ");
                double invAmt = Double.parseDouble(sc.nextLine());

                System.out.print("Enter invoice date (press enter to use today): ");
                sc.nextLine(); // ignore input for demo; using now

                // Create a lightweight Invoice object to add (use same constructor args as Invoice)
                Invoice extra = new Invoice(
                        1, now, now,
                        orgName, address, contactEmail,
                        deptName, deptCode,
                        supplierName, supplierTIN, supplierContact,
                        productName, unitPrice, quantity,
                        poNumber, now, totalAmount,
                        now, deliveredBy,
                        inspectorName, status, remarks,
                        invNo, invAmt, new Date()
                );

                report.addInvoice(extra);

                System.out.print("Add another? (yes/no): ");
                more = sc.nextLine().trim().toLowerCase();
            }

            // Calculate total and print summary (output rule appended)
            double grandTotal = report.calculateTotal();

            System.out.println("\n--- Procurement Report ---");
            System.out.println("Organization: " + report.getOrgName());
            System.out.println("Department: " + report.getDeptName() + " (" + report.getDeptCode() + ")");
            System.out.println("Supplier: " + report.getSupplierName());
            System.out.println("Product: " + report.getProductName() + " x" + report.getQuantity());
            System.out.println("Number of invoices: " + report.getInvoices().size());
            System.out.printf("Grand total (sum of invoices): %.2f\n", grandTotal);

            System.out.println("\nOUTPUT | " + studentID);

        } catch (ProcurementDataException ex) {
            System.err.println("Validation error: " + ex.getMessage() + " | " + studentID);
        } catch (NumberFormatException ex) {
            System.err.println("Invalid number format: " + ex.getMessage() + " | " + studentID);
        } catch (Exception ex) {
            System.err.println("Unexpected error: " + ex.getMessage() + " | " + studentID);
        } finally {
            sc.close();
        }
    }
}
