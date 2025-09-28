package pkg2024ta.q2;

import java.util.Scanner;

public class RunApplication {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String vehicleType;
        String city;
        int accidentTotal;

        // Get valid vehicle type
        while (true) {
            System.out.print("Enter the accident vehicle type: ");
            vehicleType = input.nextLine().trim();
            if (!vehicleType.isEmpty()) {
                break;
            }
            System.out.println("The vehicle type cannot be empty.");
        }

        // Get valid city
        while (true) {
            System.out.print("Enter the city for the vehicle accidents: ");
            city = input.nextLine().trim();
            if (!city.isEmpty()) {
                break;
            }
            System.out.println("The city cannot be blank.");
        }

        // Get valid accident total
        while (true) {
            System.out.print("Enter the total " + vehicleType + " accidents for " + city + ": ");
            if (input.hasNextInt()) {
                accidentTotal = input.nextInt();
                if (accidentTotal > 0) {
                    break;
                } else {
                    System.out.println("Accidents must be greater than zero.");
                }
            } else {
                System.out.println("Please enter a valid number.");
                input.next(); // Clear invalid input
            }
        }

        // Create report object
        RoadAccidentReport report = new RoadAccidentReport(vehicleType, city, accidentTotal);

        // Print report
        report.printAccidentReport();

        input.close();
    }
}
