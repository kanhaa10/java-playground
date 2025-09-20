/*A rental company wants a system that:

Manages different types of vehicles (Car, Bike, Truck).

Each vehicle has common details (id, brand, daily rent).

Each type has additional attributes (Car → seating capacity, Bike → engine CC, Truck → load capacity).

Rent calculation depends on type:

Car: daily rent × days

Bike: daily rent × days – 5% discount if rented > 7 days

Truck: daily rent × days + ₹500 if load > 1000 kg

The program should allow renting vehicles and generate bills.*/

abstract class Vehicle {
    private int id;
    private String brand;
    private double dailyRent;

    Vehicle(int id, String brand, double dailyRent) {
        this.id = id;
        this.brand = brand;
        this.dailyRent = dailyRent;
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public double getDailyRent() {
        return dailyRent;
    }

    abstract double calculateRent(int days);
    abstract void displayDetail(int days);
}

class Car extends Vehicle {
    private int seatingCapacity;

    Car(int id, String brand, double rent, int seatingCapacity) {
        super(id, brand, rent);
        this.seatingCapacity = seatingCapacity;
    }

    double calculateRent(int days) {
        return getDailyRent() * days;
    }

    void displayDetail(int days) {
        System.out.println("ID: " + getId() +
                ", Brand: " + getBrand() +
                ", Daily Rent: " + getDailyRent() +
                ", Seating Capacity: " + seatingCapacity +
                ", Total Rent: " + calculateRent(days));
    }
}

class Bike extends Vehicle {
    private int engineCC;

    Bike(int id, String brand, double rent, int engineCC) {
        super(id, brand, rent);
        this.engineCC = engineCC;
    }

    double calculateRent(int days) {
        double rent = getDailyRent() * days;
        if (days > 7) {
            rent *= 0.95; // 5% discount
        }
        return rent;
    }

    void displayDetail(int days) {
        System.out.println("ID: " + getId() +
                ", Brand: " + getBrand() +
                ", Daily Rent: " + getDailyRent() +
                ", Engine CC: " + engineCC +
                ", Total Rent: " + calculateRent(days));
    }
}

class Truck extends Vehicle {
    private double loadCapacity;

    Truck(int id, String brand, double rent, double loadCapacity) {
        super(id, brand, rent);
        this.loadCapacity = loadCapacity;
    }

    double calculateRent(int days) {
        double rent = getDailyRent() * days;
        if (loadCapacity > 1000) {
            rent += 500; // extra charge
        }
        return rent;
    }

    void displayDetail(int days) {
        System.out.println("ID: " + getId() +
                ", Brand: " + getBrand() +
                ", Daily Rent: " + getDailyRent() +
                ", Load Capacity: " + loadCapacity +
                ", Total Rent: " + calculateRent(days));
    }
}

public class MainVechile {
    public static void main(String[] args) {
        Vehicle v1 = new Car(1, "BMW", 1000, 5);
        Vehicle v2 = new Bike(2, "Yamaha", 500, 180);
        Vehicle v3 = new Truck(3, "Tata", 2000, 1200);

        v1.displayDetail(10);
        v2.displayDetail(8);
        v3.displayDetail(5);
    }
}
