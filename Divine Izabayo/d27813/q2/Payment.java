package d27813.q2;
import java.util.Date;

public class Payment extends Booking {
    private Date paymentDate;
    private String paymentMethod;
    private double amountPaid;

    public Payment(int id, Date c, Date u,
                   String airportName, String code, String location,
                   String airlineName, String airlineCode, String contactEmail,
                   String flightNumber, String departure, String destination,
                   double baseFare,
                   String pilotName, String licenseNumber, int experienceYears,
                   String crewName, String role, String shift,
                   String passengerName, int age, String gender, String contact,
                   Date bookingDate, String seatNumber, String travelClass,
                   Date paymentDate, String paymentMethod, double amountPaid) {

        super(id, c, u, airportName, code, location,
              airlineName, airlineCode, contactEmail,
              flightNumber, departure, destination, baseFare,
              pilotName, licenseNumber, experienceYears,
              crewName, role, shift,
              passengerName, age, gender, contact,
              bookingDate, seatNumber, travelClass);

        if (amountPaid <= 0) throw new IllegalArgumentException("Amount must be > 0");
        if (paymentMethod.isEmpty()) throw new IllegalArgumentException("Payment method required");

        this.paymentDate = paymentDate;
        this.paymentMethod = paymentMethod;
        this.amountPaid = amountPaid;
    }
}
