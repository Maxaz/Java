package polymorphism.exercise;

public class Ford extends Car {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        //System.out.println("The Holden's engine is starting");
        return "The Ford's engine is starting";
    }

    @Override
    public String accelerate() {
        //System.out.println("The Holden is accelerating");
        return "The Ford is accelerating";
    }

    @Override
    public String brake() {
        //System.out.println("The Holden is braking");
        return "The Ford is braking";
    }
}
