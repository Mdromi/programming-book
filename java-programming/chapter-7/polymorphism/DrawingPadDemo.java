package polymorphism;

public class DrawingPadDemo {
    public static void main(String[] args) {
        DrawingPad pad = new DrawingPad();
        Circle circle = new Circle();
        Square square = new Square();

        pad.draw(circle);
        pad.draw(square);
    }
}

public class Shape {
    private final String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Circle extends Shape {
    public Circle() {
        super("Circle");
    }
}

public class Square extends Shape{
    public Square() {
        super("Square");
    }
}

public class DrawingPad {
    public void draw(Shape shape) {
        String actualType = shape.getClass().getTypeName();

        System.out.println("Actual type: " + actualType);
        System.out.println("Drawing " + shape.getName());
    }
}

