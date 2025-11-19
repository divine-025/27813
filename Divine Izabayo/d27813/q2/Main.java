package d27813.q2;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String studentID = "d27813"; 

        System.out.println("Enter ticket number:");
        String tnum = sc.nextLine();

        Ticket ticket = new Ticket(
                1, new Date(), new Date(),
                "Kigali Airport", "KGL", "Kigali",
                "RwandaAir", "RWA", "info@rwa.com",
                "WB135", "Kigali", "South Korea", 350.0,
                "John Pilot", "LIC123", 5,
                "Ortence", "Attendant", "Day",
                "Divine", 20, "Female", "0788331211",
                new Date(), "12A", "Economy",
                new Date(), "MobileMoney", 950.0,
                tnum, new Date()
        );


        System.out.println("Final Fare: " + ticket.calculateFare() + " | " + studentID);
    }
}
