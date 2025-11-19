package d27813.q3;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String studentID = "d27813"; 

        try {
            System.out.println("=== Tax Administration System ===");

        
            System.out.print("Authority name: ");
            String authorityName = sc.nextLine();

            System.out.print("Region: ");
            String region = sc.nextLine();

            System.out.print("Authority email: ");
            String authorityEmail = sc.nextLine();

            System.out.print("Tax category name: ");
            String catName = sc.nextLine();

            System.out.print("Tax rate (e.g., enter 0.15 for 15%): ");
            double rate = Double.parseDouble(sc.nextLine());

            System.out.print("Tax category code (≥3 chars): ");
            String catCode = sc.nextLine();

            
            System.out.print("Taxpayer TIN (9 digits): ");
            String tin = sc.nextLine();

            System.out.print("Taxpayer name: ");
            String taxpayerName = sc.nextLine();

            System.out.print("Taxpayer address: ");
            String address = sc.nextLine();

            System.out.print("Employer name: ");
            String employerName = sc.nextLine();

            System.out.print("Employer TIN (9 digits): ");
            String employerTIN = sc.nextLine();

            System.out.print("Employer contact (10 digits): ");
            String contact = sc.nextLine();

            System.out.print("Employee name: ");
            String employeeName = sc.nextLine();

            System.out.print("Employee salary: ");
            double salary = Double.parseDouble(sc.nextLine());

            System.out.print("Employee TIN (9 digits): ");
            String employeeTIN = sc.nextLine();

            System.out.print("Declaration month (e.g., 2025-11): ");
            String declMonth = sc.nextLine();

            System.out.print("Total income (>=0): ");
            double totalIncome = Double.parseDouble(sc.nextLine());

            System.out.print("Assessed tax (>=0): ");
            double assessedTax = Double.parseDouble(sc.nextLine());

            System.out.print("Payment amount (>0): ");
            double paymentAmount = Double.parseDouble(sc.nextLine());

            System.out.print("Receipt number: ");
            String receiptNo = sc.nextLine();

            System.out.print("Credits (tax reliefs, enter 0 if none): ");
            double credits = Double.parseDouble(sc.nextLine());

            
            Date now = new Date();

        
            TaxRecord record = new TaxRecord(
                    1, now, now,
                    authorityName, region, authorityEmail,
                    catName, rate, catCode,
                    tin, taxpayerName, address,
                    employerName, employerTIN, contact,
                    employeeName, salary, employeeTIN,
                    declMonth, totalIncome,
                    now, assessedTax,
                    now, paymentAmount,
                    receiptNo, 0.0
            );

            
            double computed = record.computeTax(credits);

            
            System.out.println("\n--- Tax Record Summary ---");
            System.out.println("Taxpayer: " + record.getTaxpayerName());
            System.out.println("Employee: " + record.getEmployeeName());
            System.out.println("Salary: " + record.getSalary());
            System.out.println("Rate: " + record.getRate());
            System.out.println("Credits: " + credits);
            System.out.println("Computed Tax: " + computed);
            System.out.println("Receipt No: " + record.getReceiptNo());
            System.out.println("Payment Amount: " + record.getPaymentAmount());
            System.out.println("\n" + "OUTPUT | " + studentID);

        } catch (TaxDataException ex) {
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
