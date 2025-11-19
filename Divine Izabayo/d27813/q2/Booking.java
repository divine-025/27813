package d27813.q2;

import java.util.Date;

public class Booking extends Passenger {
    private Date bookingDate;
    private String seatNumber;
    private String travelClass;

    public Booking(int id, Date c, Date u,
                   String airportName, String code, String location,
                   String airlineName, String airlineCode, String contactEmail,
                   String flightNumber, String departure, String destination,
                   double baseFare,
                   String pilotName, String licenseNumber, int experienceYears,
                   String crewName, String role, String shift,
                   String passengerName, int age, String gender, String contact,
                   Date bookingDate, String seatNumber, String travelClass) {

        super(id, c, u, airportName, code, location,
              airlineName, airlineCode, contactEmail,
              flightNumber, departure, destination, baseFare,
              pilotName, licenseNumber, experienceYears,
              crewName, role, shift,
              passengerName, age, gender, contact);

        if (!(travelClass.equals("Economy") || travelClass.equals("Business") || travelClass.equals("First")))
            throw new IllegalArgumentException("Invalid travel class");

        this.bookingDate = bookingDate;
        this.seatNumber = seatNumber;
        this.travelClass = travelClass;
    }
}
