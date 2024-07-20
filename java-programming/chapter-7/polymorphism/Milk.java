package polymorphism;

import polymorphism.Liquid;

public class Milk extends Liquid {
    @Override
    public void swirl (boolean clockwise) {
        System.out.println("Swirling milk");
    }
}