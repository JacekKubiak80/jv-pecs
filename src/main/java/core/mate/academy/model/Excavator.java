package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int year;
    private String countyOfProduction;
    private int powerHorses;

    public Excavator(int year, String countyOfProduction, int powerHorses) {
        this.year = year;
        this.countyOfProduction = countyOfProduction;
        this.powerHorses = powerHorses;
    }

    public Excavator() {
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
