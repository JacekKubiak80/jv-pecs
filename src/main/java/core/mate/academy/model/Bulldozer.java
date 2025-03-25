package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int age;
    private String make;
    private int mass;

    public Bulldozer(int age, String make, int mass) {
        this.age = age;
        this.make = make;
        this.mass = mass;
    }

    public Bulldozer() {
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
