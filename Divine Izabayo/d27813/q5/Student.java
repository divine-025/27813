package d27813.q5;

public class Student extends Instructor {
    private String studentName;
    private String studentID;
    private int age; // > 0

    public Student(int id, java.util.Date createdDate, java.util.Date updatedDate,
                   String institutionName, String code, String address,
                   String departmentName, String departmentHead,
                   String courseName, String courseCode, int credits,
                   String instructorName, String email, String phone,
                   String studentName, String studentID, int age) {
        super(id, createdDate, updatedDate, institutionName, code, address,
              departmentName, departmentHead, courseName, courseCode, credits,
              instructorName, email, phone);

        if (studentName == null || studentName.isEmpty()) throw new AttendanceDataException("Student name required");
        if (studentID == null || studentID.isEmpty()) throw new AttendanceDataException("Student ID required");
        if (age <= 0) throw new AttendanceDataException("Age must be > 0");

        this.studentName = studentName;
        this.studentID = studentID;
        this.age = age;
    }

    public String getStudentName() { return studentName; }
    public String getStudentID() { return studentID; }
    public int getAge() { return age; }
}
