
package d27813.q1;
public class Category extends Warehouse {
    private String categoryName;
    private String categoryCode;

    public Category(int id, java.util.Date c, java.util.Date u,
                    String whName, String loc, String phone,
                    String categoryName, String categoryCode) {
        super(id, c, u, whName, loc, phone);

        if (categoryCode.length() < 3)
            throw new IllegalArgumentException("Category code must be >=3 chars");

        this.categoryName = categoryName;
        this.categoryCode = categoryCode;
    }
}
