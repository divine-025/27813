package d27813.q3;

public class Employee extends Employer {
    private String employeeName;
    private double salary;
    private String employeeTIN;

    public Employee(int id, java.util.Date createdDate, java.util.Date updatedDate,
                    String authorityName, String region, String email,
                    String categoryName, double rate, String code,
                    String tin, String taxpayerName, String address,
                    String employerName, String employerTIN, String contact,
                    String employeeName, double salary, String employeeTIN) {

        super(id, createdDate, updatedDate, authorityName, region, email, categoryName, rate, code,
              tin, taxpayerName, address, employerName, employerTIN, contact);

        if (employeeName == null || employeeName.isEmpty()) throw new TaxDataException("Employee name required");
        if (salary <= 0) throw new TaxDataException("Salary must be > 0");
        if (employeeTIN == null || !employeeTIN.matches("\\d{9}")) throw new TaxDataException("Employee TIN must be 9 digits");

        this.employeeName = employeeName;
        this.salary = salary;
        this.employeeTIN = employeeTIN;
    }

    public String getEmployeeName() { return employeeName; }
    public double getSalary() { return salary; }
    public String getEmployeeTIN() { return employeeTIN; }
}
