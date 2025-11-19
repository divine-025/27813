package d27813.q5;

public class AttendanceRecord extends ClassSession {
    private String studentIDRef;
    private String sessionID;
    private String status;

    public AttendanceRecord(int id, java.util.Date createdDate, java.util.Date updatedDate,
                            String institutionName, String code, String address,
                            String departmentName, String departmentHead,
                            String courseName, String courseCode, int credits,
                            String instructorName, String email, String phone,
                            String studentName, String studentID, int age,
                            java.util.Date sessionDate, String topic,
                            String studentIDRef, String sessionID, String status) {

        super(id, createdDate, updatedDate, institutionName, code, address,
              departmentName, departmentHead, courseName, courseCode, credits,
              instructorName, email, phone, studentName, studentID, age,
              sessionDate, topic);

        if (!(status.equals("Present") || status.equals("Absent"))) throw new AttendanceDataException("Status must be Present/Absent");
        this.studentIDRef = studentIDRef;
        this.sessionID = sessionID;
        this.status = status;
    }

    public String getStudentIDRef() { return studentIDRef; }
    public String getSessionID() { return sessionID; }
    public String getStatus() { return status; }
}
