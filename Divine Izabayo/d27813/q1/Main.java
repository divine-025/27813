package d27813.q1;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String studentID = "d27813";  

        System.out.println("Enter report remarks: ");
        String remarks = sc.nextLine();

        StockReport report = new StockReport(
                1, new Date(), new Date(),
                "Central Warehouse", "Kigali", "0788331211",
                "beaty products", "BTY01",
                "Lisa", "lisa11@gmail.com", "0788331211",
                "Aloevera", 700.0, 10,
                50, 5,
                new Date(), 20, "Kizere supplier",
                new Date(), 5, "Divine Izabayo",
                45, 31500.0,
                new Date(), remarks
        );

        
        System.out.println(report.generateReport() + " | " + studentID);
        sc.close();
    }
}
