package d27813.q5;

import java.util.Date;

public class Entity {
    private int id;
    private Date createdDate;
    private Date updatedDate;

    public Entity(int id, Date createdDate, Date updatedDate) {
        if (id <= 0) throw new AttendanceDataException("ID must be > 0");
        if (createdDate == null || updatedDate == null) throw new AttendanceDataException("Dates cannot be null");
        this.id = id;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }

    public int getId() { return id; }
    public Date getCreatedDate() { return createdDate; }
    public Date getUpdatedDate() { return updatedDate; }
}
