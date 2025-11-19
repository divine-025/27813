package d27813.q6;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String studentID = "d27813";

        try {
            System.out.println("=== Payroll Management System (RSSB) ===");

        
            System.out.print("Organization Name: ");
            String orgName = sc.nextLine();

            System.out.print("Org Code (≥3 chars): ");
            String orgCode = sc.nextLine();

            System.out.print("RSSB Number (8 digits): ");
            String rssbNumber = sc.nextLine();

            System.out.print("Contact Email: ");
            String contactEmail = sc.nextLine();

        
            System.out.print("Department Name: ");
            String deptName = sc.nextLine();

            System.out.print("Department Code (≥3 chars): ");
            String deptCode = sc.nextLine();

            System.out.print("Manager Name: ");
            String managerName = sc.nextLine();


            System.out.print("Employee ID (≥1000): ");
            int empID = Integer.parseInt(sc.nextLine());

            System.out.print("Employee Full Name: ");
            String fullName = sc.nextLine();

            System.out.print("Position: ");
            String position = sc.nextLine();

            System.out.print("Base Salary (>0): ");
            double baseSalary = Double.parseDouble(sc.nextLine());

            System.out.print("RSSB Registered? (true/false): ");
            boolean rssbRegistered = Boolean.parseBoolean(sc.nextLine());

        
            System.out.print("Payroll Month (1-12): ");
            int month = Integer.parseInt(sc.nextLine());

            System.out.print("Payroll Year (>=2000): ");
            int year = Integer.parseInt(sc.nextLine());

            Date now = new Date();
            System.out.print("Payroll Start Date (ignored, will use current date): ");
            Date startDate = now;
            System.out.print("Payroll End Date (ignored, will use current date): ");
            Date endDate = now;


            System.out.print("Basic Pay: ");
            double basicPay = Double.parseDouble(sc.nextLine());

            System.out.print("Transport Allowance: ");
            double transportAllowance = Double.parseDouble(sc.nextLine());

            System.out.print("Housing Allowance: ");
            double housingAllowance = Double.parseDouble(sc.nextLine());

    
            System.out.print("PAYE Tax: ");
            double payeTax = Double.parseDouble(sc.nextLine());

            System.out.print("Loan Deduction: ");
            double loanDeduction = Double.parseDouble(sc.nextLine());
            System.out.print("Overtime Hours: ");
            double overtimeHours = Double.parseDouble(sc.nextLine());

            System.out.print("Overtime Rate: ");
            double overtimeRate = Double.parseDouble(sc.nextLine());

            System.out.print("Bonus: ");
            double bonus = Double.parseDouble(sc.nextLine());

        
            System.out.print("Payslip Number: ");
            String payslipNumber = sc.nextLine();

            Date issueDate = new Date();

    
            Payslip payslip = new Payslip(
                    1, now, now,
                    orgName, orgCode, rssbNumber, contactEmail,
                    deptName, deptCode, managerName,
                    empID, fullName, position, baseSalary, rssbRegistered,
                    month, year, startDate, endDate,
                    basicPay, transportAllowance, housingAllowance,
                    payeTax, loanDeduction,
                    overtimeHours, overtimeRate, bonus,
                    payslipNumber, issueDate
            );

        
            payslip.generatePayslip();

        } catch (PayrollDataException ex) {
            System.err.println("Validation error: " + ex.getMessage() + " | " + studentID);
        } catch (NumberFormatException ex) {
            System.err.println("Invalid number format: " + ex.getMessage() + " | " + studentID);
        } catch (Exception ex) {
            System.err.println("Unexpected error: " + ex.getMessage() + " | " + studentID);
        } finally {
        
            sc.close();
            System.out.println("Scanner closed. Program ended.");
        }
    }
}
