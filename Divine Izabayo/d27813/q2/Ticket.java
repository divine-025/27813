package d27813.q2;

public final class Ticket extends Payment {
    private String ticketNumber;
    private java.util.Date issueDate;

    public Ticket(int id, java.util.Date c, java.util.Date u,
                  String airportName, String code, String location,
                  String airlineName, String airlineCode, String contactEmail,
                  String flightNumber, String departure, String destination,
                  double baseFare,
                  String pilotName, String licenseNumber, int experienceYears,
                  String crewName, String role, String shift,
                  String passengerName, int age, String gender, String contact,
                  java.util.Date bookingDate, String seatNumber, String travelClass,
                  java.util.Date paymentDate, String paymentMethod, double amountPaid,
                  String ticketNumber, java.util.Date issueDate) {

        super(id, c, u, airportName, code, location,
              airlineName, airlineCode, contactEmail,
              flightNumber, departure, destination, baseFare,
              pilotName, licenseNumber, experienceYears,
              crewName, role, shift,
              passengerName, age, gender, contact,
              bookingDate, seatNumber, travelClass,
              paymentDate, paymentMethod, amountPaid);

        this.ticketNumber = ticketNumber;
        this.issueDate = issueDate;
    }

    public double calculateFare() {
        double taxes = getBaseFare() * 0.16;      // 16% tax
        double discount = getBaseFare() * 0.05;   // 5% discount
        return (getBaseFare() + taxes) - discount;
    }
}
