package d27813.q5;

import java.util.Date;

public class ClassSession extends Student {
    private Date sessionDate;
    private String topic;

    public ClassSession(int id, java.util.Date createdDate, java.util.Date updatedDate,
                        String institutionName, String code, String address,
                        String departmentName, String departmentHead,
                        String courseName, String courseCode, int credits,
                        String instructorName, String email, String phone,
                        String studentName, String studentID, int age,
                        Date sessionDate, String topic) {
        super(id, createdDate, updatedDate, institutionName, code, address,
              departmentName, departmentHead, courseName, courseCode, credits,
              instructorName, email, phone, studentName, studentID, age);

        if (sessionDate == null) throw new AttendanceDataException("Session date cannot be null");
        if (topic == null || topic.isEmpty()) throw new AttendanceDataException("Topic required");

        this.sessionDate = sessionDate;
        this.topic = topic;
    }

    public Date getSessionDate() { return sessionDate; }
    public String getTopic() { return topic; }
}
