package d27813.q5;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public final class AttendanceSummary extends LeaveRequest {
    private Date reportDate;
    private int totalPresent;
    private int totalAbsent;
    private List<AttendanceRecord> records = new ArrayList<>();

    public AttendanceSummary(int id, Date createdDate, Date updatedDate,
                             String institutionName, String code, String address,
                             String departmentName, String departmentHead,
                             String courseName, String courseCode, int credits,
                             String instructorName, String email, String phone,
                             String studentName, String studentID, int age,
                             Date sessionDate, String topic,
                             String studentIDRef, String sessionID, String status,
                             Date requestDate, String reason, boolean approved,
                             Date reportDate) {

        super(id, createdDate, updatedDate, institutionName, code, address,
              departmentName, departmentHead, courseName, courseCode, credits,
              instructorName, email, phone, studentName, studentID, age,
              sessionDate, topic, studentIDRef, sessionID, status,
              requestDate, reason, approved);

        if (reportDate == null) throw new AttendanceDataException("Report date cannot be null");
        this.reportDate = reportDate;

        
        this.records.add(this);
    }

    public void addRecord(AttendanceRecord record) {
        if (record == null) throw new AttendanceDataException("Record cannot be null");
        records.add(record);
    }

    public int getTotalPresent() { return totalPresent; }
    public int getTotalAbsent() { return totalAbsent; }
    public Date getReportDate() { return reportDate; }

    public double generateSummary() {
        totalPresent = 0;
        totalAbsent = 0;
        for (AttendanceRecord r : records) {
            if (r.getStatus().equals("Present")) totalPresent++;
            else if (r.getStatus().equals("Absent")) totalAbsent++;
        }
        int totalSessions = totalPresent + totalAbsent;
        return totalSessions == 0 ? 0 : (totalPresent * 100.0 / totalSessions);
    }
}
