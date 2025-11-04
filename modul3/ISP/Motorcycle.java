
public class Motorcycle implements VehicleInterface {

    private String name;
    private int fuel;

    public Motorcycle(String name) {
        this.name = name;
        this.fuel = 50;
    }

    @Override
    public void drive() {
        if (fuel > 0) {
            System.out.println(name + " is driving...");
            fuel -= 10;
        } else {
            System.out.println(name + " cannot move, no fuel!");
        }
    }

    @Override
    public void stop() {
        System.out.println(name + " has stopped.");
    }

    @Override
    public void refuel() {
        fuel = 100;
        System.out.println(name + " refueled to full tank.");
    }

    public void showStatus() {
        System.out.println("Fuel level: " + fuel);
    }
}
