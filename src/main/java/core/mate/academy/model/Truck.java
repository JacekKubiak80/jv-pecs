package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int yearOfProduction;
    private int engineCapacity;
    private int numberOfAxles;

    public Truck(int yearOfProduction, int engineCapacity, int numberOfAxles) {
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
        this.numberOfAxles = numberOfAxles;
    }

    public Truck() {
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
