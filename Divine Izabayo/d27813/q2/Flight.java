package d27813.q2;

public class Flight extends Airline {
    private String flightNumber;
    private String departure;
    private String destination;
    private double baseFare;

    public Flight(int id, java.util.Date c, java.util.Date u,
                  String airportName, String code, String location,
                  String airlineName, String airlineCode, String contactEmail,
                  String flightNumber, String departure, String destination,
                  double baseFare) {

        super(id, c, u, airportName, code, location, airlineName, airlineCode, contactEmail);

        if (flightNumber.isEmpty() || departure.isEmpty() || destination.isEmpty())
            throw new IllegalArgumentException("Fields cannot be empty");

        if (baseFare <= 0) throw new IllegalArgumentException("Fare must be > 0");

        this.flightNumber = flightNumber;
        this.departure = departure;
        this.destination = destination;
        this.baseFare = baseFare;
    }

    public double getBaseFare() { return baseFare; }
}
