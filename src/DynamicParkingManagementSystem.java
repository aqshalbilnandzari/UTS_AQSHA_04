import java.util.Scanner;

public class DynamicParkingManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter parking lot capacity: ");
        int capacity = scanner.nextInt();
        ParkingLot parkingLot = new ParkingLot(capacity);

        boolean running = true;
        while (running) {
            System.out.println("\nMenu:");
            System.out.println("1. Park a car");
            System.out.println("2. Remove a car");
            System.out.println("3. Display parked cars");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    scanner.nextLine(); // Consume newline character
                    System.out.print("Enter plate number of the car to park: ");
                    String plateNumber = scanner.nextLine();
                    Car car = new Car(plateNumber);
                    parkingLot.parkCar(car);
                    break;
                case 2:
                    scanner.nextLine(); // Consume newline character
                    System.out.print("Enter plate number of the car to remove: ");
                    String plateToRemove = scanner.nextLine();
                    parkingLot.removeCar(plateToRemove);
                    break;
                case 3:
                    parkingLot.displayParkedCars();
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }

        scanner.close();
    }
}