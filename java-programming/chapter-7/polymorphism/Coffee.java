package polymorphism;

import polymorphism.Liquid;

public class Coffee extends Liquid {
    @Override
    public void swirl (boolean clockwise) {
        System.out.println("Swirling coffee");
    }
}