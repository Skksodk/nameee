import java.util.Scanner;

public class RikshawFare {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Fixed rates
        double baseFare = 50;
        double perKm = 20;
        double perMin = 2;

        System.out.println("Enter distance (km): ");
        double distance = sc.nextDouble();

        System.out.println("Enter time in minutes: ");
        int time = sc.nextInt();

        System.out.println("Is the customer a local? (yes/no): ");
        String local = sc.next();

        System.out.println("Is it night? (yes/no): ");
        String night = sc.next();

        double totalFare = baseFare + (distance * perKm) + (time * perMin);

        // Discount for locals (> 5km)
        if (local.equalsIgnoreCase("yes") && distance > 5) {
            totalFare = totalFare - (totalFare * 0.10); // 10% discount
        }

        // Night time surcharge (20%)
        if (night.equalsIgnoreCase("yes")) {
            totalFare = totalFare + (totalFare * 0.20); // 20% surcharge
        }

        System.out.println("Final Fare: Rs. " + totalFare);
    
    }
}
