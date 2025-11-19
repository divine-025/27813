package d27813.q5;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String studentID = "d27813";

        try {
            System.out.println("=== Attendance Management System ===");

            System.out.print("Institution name: ");
            String instName = sc.nextLine();

            System.out.print("Institution code (≥3 chars): ");
            String instCode = sc.nextLine();

            System.out.print("Institution address: ");
            String instAddress = sc.nextLine();

            System.out.print("Department name: ");
            String deptName = sc.nextLine();

            System.out.print("Department head: ");
            String deptHead = sc.nextLine();

            System.out.print("Course name: ");
            String courseName = sc.nextLine();

            System.out.print("Course code (≥3 chars): ");
            String courseCode = sc.nextLine();

            System.out.print("Credits (>0): ");
            int credits = Integer.parseInt(sc.nextLine());

            System.out.print("Instructor name: ");
            String instrName = sc.nextLine();

            System.out.print("Instructor email: ");
            String instrEmail = sc.nextLine();

            System.out.print("Instructor phone (10 digits): ");
            String instrPhone = sc.nextLine();

            System.out.print("Student name: ");
            String studentName = sc.nextLine();

            System.out.print("Student ID: ");
            String studentIDInput = sc.nextLine();

            System.out.print("Student age (>0): ");
            int age = Integer.parseInt(sc.nextLine());

            System.out.print("Session topic: ");
            String topic = sc.nextLine();

            Date now = new Date();

            System.out.print("Attendance status (Present/Absent): ");
            String status = sc.nextLine();

            System.out.print("Leave reason (optional, type 'none' if not requested): ");
            String reason = sc.nextLine();
            boolean approved = false;

            if (!reason.equalsIgnoreCase("none")) {
                approved = true;
            }

            AttendanceSummary summary = new AttendanceSummary(
                    1, now, now, instName, instCode, instAddress,
                    deptName, deptHead, courseName, courseCode, credits,
                    instrName, instrEmail, instrPhone,
                    studentName, studentIDInput, age,
                    now, topic, studentIDInput, "S1", status,
                    now, reason, approved, now
            );

            System.out.print("Add another attendance record? (yes/no): ");
            String more = sc.nextLine().trim().toLowerCase();

            while (more.equals("yes")) {
                System.out.print("Student name: ");
                String sName = sc.nextLine();

                System.out.print("Student ID: ");
                String sID = sc.nextLine();

                System.out.print("Status (Present/Absent): ");
                String sStatus = sc.nextLine();

                AttendanceRecord rec = new AttendanceRecord(
                        2, now, now, instName, instCode, instAddress,
                        deptName, deptHead, courseName, courseCode, credits,
                        instrName, instrEmail, instrPhone,
                        sName, sID, age, now, topic, sID, "S2", sStatus
                );
                summary.addRecord(rec);

                System.out.print("Add another? (yes/no): ");
                more = sc.nextLine().trim().toLowerCase();
            }

            double percentage = summary.generateSummary();

            System.out.println("\n--- Attendance Summary ---");
            System.out.println("Total Present: " + summary.getTotalPresent());
            System.out.println("Total Absent: " + summary.getTotalAbsent());
            System.out.printf("Attendance Percentage: %.2f%%\n", percentage);
            System.out.println("\nOUTPUT | " + studentID);

        } catch (AttendanceDataException ex) {
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
