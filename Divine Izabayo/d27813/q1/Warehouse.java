
package d27813.q1;
public class Warehouse extends Entity {
    private String warehouseName;
    private String location;
    private String contactNumber;

    public Warehouse(int id, java.util.Date c, java.util.Date u,
                     String warehouseName, String location, String contactNumber) {
        super(id, c, u);

        if (contactNumber.length() != 10)
            throw new IllegalArgumentException("Phone must be 10 digits");

        this.warehouseName = warehouseName;
        this.location = location;
        this.contactNumber = contactNumber;
    }
}
