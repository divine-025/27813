package d27813.q2;

public class CabinCrew extends Pilot {
    private String crewName;
    private String role;
    private String shift;

    public CabinCrew(int id, java.util.Date c, java.util.Date u,
                     String airportName, String code, String location,
                     String airlineName, String airlineCode, String contactEmail,
                     String flightNumber, String departure, String destination,
                     double baseFare,
                     String pilotName, String licenseNumber, int experienceYears,
                     String crewName, String role, String shift) {

        super(id, c, u, airportName, code, location,
              airlineName, airlineCode, contactEmail,
              flightNumber, departure, destination, baseFare,
              pilotName, licenseNumber, experienceYears);

        if (role.isEmpty())
            throw new IllegalArgumentException("Role cannot be empty");

        if (!(shift.equals("Day") || shift.equals("Night")))
            throw new IllegalArgumentException("Shift must be Day or Night");

        this.crewName = crewName;
        this.role = role;
        this.shift = shift;
    }
}
