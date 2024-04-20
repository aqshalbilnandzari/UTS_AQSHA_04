import java.util.ArrayList;

class ParkingLot {
    private ArrayList<Car> parkedCars;
    private int capacity;

    public ParkingLot(int capacity) {
        this.capacity = capacity;
        parkedCars = new ArrayList<>();
    }

    public boolean parkCar(Car car) {
        if (parkedCars.size() < capacity) {
            parkedCars.add(car);
            System.out.println("Car with plate number " + car.getPlateNumber() + " parked successfully.");
            return true;
        } else {
            System.out.println("Parking lot is full.");
            return false;
        }
    }

    public void removeCar(String plateNumber) {
        for (Car car : parkedCars) {
            if (car.getPlateNumber().equals(plateNumber)) {
                parkedCars.remove(car);
                System.out.println("Car with plate number " + plateNumber + " removed from parking lot.");
                return;
            }
        }
        System.out.println("Car with plate number " + plateNumber + " is not parked in this parking lot.");
    }

    public void displayParkedCars() {
        if (parkedCars.isEmpty()) {
            System.out.println("Parking lot is empty.");
        } else {
            System.out.println("List of parked cars:");
            for (Car car : parkedCars) {
                System.out.println(car.getPlateNumber());
            }
        }
    }
}
