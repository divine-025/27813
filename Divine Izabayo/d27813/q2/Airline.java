package d27813.q2;

public class Airline extends Airport {
    private String airlineName;
    private String airlineCode;
    private String contactEmail;

    public Airline(int id, java.util.Date c, java.util.Date u,
                   String airportName, String code, String location,
                   String airlineName, String airlineCode, String contactEmail) {

        super(id, c, u, airportName, code, location);

        if (airlineCode.length() < 2 || airlineCode.length() > 4)
            throw new IllegalArgumentException("Airline code must be 2–4 letters");

        if (!contactEmail.contains("@"))
            throw new IllegalArgumentException("Invalid email");

        this.airlineName = airlineName;
        this.airlineCode = airlineCode;
        this.contactEmail = contactEmail;
    }
}
