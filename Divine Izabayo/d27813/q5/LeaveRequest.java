package d27813.q5;

import java.util.Date;

public class LeaveRequest extends AttendanceRecord {
    private Date requestDate;
    private String reason;
    private boolean approved;

    public LeaveRequest(int id, java.util.Date createdDate, java.util.Date updatedDate,
                        String institutionName, String code, String address,
                        String departmentName, String departmentHead,
                        String courseName, String courseCode, int credits,
                        String instructorName, String email, String phone,
                        String studentName, String studentID, int age,
                        java.util.Date sessionDate, String topic,
                        String studentIDRef, String sessionID, String status,
                        Date requestDate, String reason, boolean approved) {

        super(id, createdDate, updatedDate, institutionName, code, address,
              departmentName, departmentHead, courseName, courseCode, credits,
              instructorName, email, phone, studentName, studentID, age,
              sessionDate, topic, studentIDRef, sessionID, status);

        if (requestDate == null) throw new AttendanceDataException("Request date cannot be null");
        if (reason == null || reason.isEmpty()) throw new AttendanceDataException("Reason required");

        this.requestDate = requestDate;
        this.reason = reason;
        this.approved = approved;
    }

    public Date getRequestDate() { return requestDate; }
    public String getReason() { return reason; }
    public boolean isApproved() { return approved; }
}
