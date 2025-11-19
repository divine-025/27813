package d27813.q2;

public class Pilot extends Flight {
    private String pilotName;
    private String licenseNumber;
    private int experienceYears;

    public Pilot(int id, java.util.Date c, java.util.Date u,
                 String airportName, String code, String location,
                 String airlineName, String airlineCode, String contactEmail,
                 String flightNumber, String departure, String destination,
                 double baseFare,
                 String pilotName, String licenseNumber, int experienceYears) {

        super(id, c, u, airportName, code, location,
              airlineName, airlineCode, contactEmail,
              flightNumber, departure, destination, baseFare);

        if (licenseNumber.isEmpty())
            throw new IllegalArgumentException("License cannot be empty");

        if (experienceYears < 2)
            throw new IllegalArgumentException("Experience must be >= 2 years");

        this.pilotName = pilotName;
        this.licenseNumber = licenseNumber;
        this.experienceYears = experienceYears;
    }
}
