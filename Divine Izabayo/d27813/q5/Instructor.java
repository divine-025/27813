package d27813.q5;

public class Instructor extends Course {
    private String instructorName;
    private String email;
    private String phone; // 10 digits

    public Instructor(int id, java.util.Date createdDate, java.util.Date updatedDate,
                      String institutionName, String code, String address,
                      String departmentName, String departmentHead,
                      String courseName, String courseCode, int credits,
                      String instructorName, String email, String phone) {
        super(id, createdDate, updatedDate, institutionName, code, address,
              departmentName, departmentHead, courseName, courseCode, credits);

        if (instructorName == null || instructorName.isEmpty()) throw new AttendanceDataException("Instructor name required");
        if (!isValidEmail(email)) throw new AttendanceDataException("Invalid email");
        if (!isValidPhone(phone)) throw new AttendanceDataException("Phone must be 10 digits");

        this.instructorName = instructorName;
        this.email = email;
        this.phone = phone;
    }

    private boolean isValidEmail(String e) { return e != null && e.contains("@") && e.contains("."); }
    private boolean isValidPhone(String p) { return p != null && p.matches("\\d{10}"); }

    public String getInstructorName() { return instructorName; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
}
