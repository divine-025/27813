package d27813.q2;

public class Airport extends Entity {
    private String airportName;
    private String code;
    private String location;

    public Airport(int id, java.util.Date c, java.util.Date u,
                   String airportName, String code, String location) {
        super(id, c, u);

        if (code.length() != 3 || !code.equals(code.toUpperCase()))
            throw new IllegalArgumentException("Airport code must be 3 uppercase letters");

        this.airportName = airportName;
        this.code = code;
        this.location = location;
    }
}
