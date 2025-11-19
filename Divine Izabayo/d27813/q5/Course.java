package d27813.q5;

public class Course extends Department {
    private String courseName;
    private String courseCode; 
    private int credits;       

    public Course(int id, java.util.Date createdDate, java.util.Date updatedDate,
                  String institutionName, String code, String address,
                  String departmentName, String departmentHead,
                  String courseName, String courseCode, int credits) {
        super(id, createdDate, updatedDate, institutionName, code, address, departmentName, departmentHead);

        if (courseName == null || courseName.isEmpty()) throw new AttendanceDataException("Course name required");
        if (courseCode == null || courseCode.length() < 3) throw new AttendanceDataException("Course code must be ≥ 3 chars");
        if (credits <= 0) throw new AttendanceDataException("Credits must be > 0");

        this.courseName = courseName;
        this.courseCode = courseCode;
        this.credits = credits;
    }

    public String getCourseName() { return courseName; }
    public String getCourseCode() { return courseCode; }
    public int getCredits() { return credits; }
}
