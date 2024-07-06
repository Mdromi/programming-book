// java chapter-6/Bycycle.java

public class Bycycle {
    private int cadence = 0;
    private int speed = 0;
    private int gear = 1;

    public void changeCadence(int newValue) {
        cadence = newValue;
    }

    public void changeGear(int newValue) {
        gear = newValue;
    }

    public void speedUp(int increment) {
        speed = speed + increment;
    }

    public void applyBreaks(int decrement) {
        speed = speed - decrement;
    }

    public void printStates() {
        System.out.println("Cadence:" + cadence + " speed:" + speed + " gear:" + gear);
    }

    public static void main(String[] args) {
        // Create two different  bycycle

        Bycycle bike1 = new Bycycle();
        Bycycle bike2 = new Bycycle();

        // call method on those objects
        bike1.changeCadence(50);
        bike1.speedUp(10);
        bike1.changeGear(2);
        bike1.printStates();

        bike2.changeCadence(50);
        bike2.speedUp(10);
        bike2.changeGear(2);
        bike2.changeCadence(40);
        bike2.speedUp(10);
        bike2.changeGear(3);
        bike2.printStates();
    }
}