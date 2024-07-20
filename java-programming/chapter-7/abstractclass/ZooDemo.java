package abstractclass;

public class ZooDemo {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0] = new Tiger();
        animals[1] = new Lion();
        animals[2] = new Snack();
        animals[3] = new Deer();
        
        Zoo zoo = new Zoo(animals);
        zoo.printInfo();
    } 
}

public abstract class Animal {
    private final int legs;
    private String name;

    public Animal(int legs, String name) {
        this.legs = legs;
        this.name = name;
    }

    public abstract String getDiests();
    
    @Override
    public String toString() {
        return (name + " has " + legs + " leg(s)");
    }
}

public class Tiger extends Animal {
    public Tiger() {
        super(4, "Tiger");
    }

    @Override
    public String getDiests() {
        return "Meet";
    }
}

public class Lion extends Animal {
    public Lion() {
        super(4, "Lion");
    }

    @Override
    public String getDiests() {
        return "Meet";
    }
}

public class Snack extends Animal {
    public Snack() {
        super(0, "Snack");
    }

    @Override
    public String getDiests() {
        return "Meet";
    }
}

public class Deer extends Animal {
    public Deer() {
        super(4, "Deer");
    }

    @Override
    public String getDiests() {
        return "Grass";
    }
}

public class Zoo {
    private Animal[] animals;

    public Zoo(Animal[] animals) {
        this.animals = animals;
    }

    public void printInfo() {
        for (Animal animal : animals) {
            System.out.println(animal.toString());
            System.out.println("Diet: " + animal.getDiests());
        }
    }
}